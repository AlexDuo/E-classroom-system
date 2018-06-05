package Reservation.action;

import javax.servlet.http.Cookie;

import org.apache.commons.lang.StringUtils;

import Reservation.entity.User;
import Reservation.service.UserService;
import Reservation.util.CookieUtil;

public class UserAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;
	
	private User user;
	
	private boolean autoLogin;
	//�Զ���¼��ʵ��
	public String viewLogin() throws Exception {
		Cookie[] cookies = getRequest().getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("userKey")) {
					int userId = 0;
					userId = Integer.parseInt(cookie.getValue());
					user = userService.getUserById(userId);
					if(user != null) {
						autoLogin = true;
						loginSuccess(user);
						return SUCCESS;
					}
				}
			}
		}
		return "login";
	}
	//��¼����
	public String login() throws Exception {
		User u = userService.getByUserInfo(user);
		if(u == null) {
			return "login";
		} else {
			loginSuccess(u);
			return SUCCESS;
		}
	}
	//��¼�ɹ���������Session��Cookie��д���û�id ��ifautologin�㹳�ˣ�
	public void loginSuccess(User user) {
		if(autoLogin) {
			CookieUtil.setCookie("userKey", user.getId().toString(), 31536000);
		} else {
			CookieUtil.deleteCookie("userKey");
		}
		getSession().setAttribute("userKey", user.getId());
	}
	//�ǳ���ɾ��Session��cookie������û�ID��
	public String logOff() throws Exception {
		getSession().removeAttribute("userKey");
		CookieUtil.deleteCookie("userKey");
		return SUCCESS;
	}
	//��ʾ�û���Ϣ���û��Լ���¼��鿴����������ʾ���û���Ϣ��
	public String info() throws Exception {
		System.out.println("**************");
		if(getUserInfo() != null) {
			user = userService.getUserById((Integer)getUserInfo());
			if(user != null) 
				return "info";
		}
		return "login";
	}
	
	//����û��ķ������û�ע�� ����Ա����û����ã�
	public String add() throws Exception {
		userService.save(user);
		return SUCCESS;
	}
	//�޸ĵ�ʱ�򷵻ص�ԭʼ�û���Ϣ
	public String viewUpdate() throws Exception {
		user = userService.getUserById(getId());
		return "update";
	}
	//�ύ�޸����󣨹���Ա&�û���
	public String update() throws Exception {
		userService.update(user);
		return SUCCESS;
	}
	//����IDɾ���û���Ϣ������Ա��
	public String delete() throws Exception {
		userService.deleteById(getId());
		return SUCCESS;
	}
	//����Ա�õ������û���Ϣ
	public String list() throws Exception {
		setPage(userService.getPage(getPageNum(), getPageSize()));
		return "list";
	}
	//����Ա�õ������û���Ϣ
	public String detail() throws Exception {
		user = userService.getUserById(getId());
		return "detail";
	}
//���������������£�
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(Boolean autoLogin) {
		this.autoLogin = autoLogin;
	}
	
}
