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
	//自动登录的实现
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
	//登录方法
	public String login() throws Exception {
		User u = userService.getByUserInfo(user);
		if(u == null) {
			return "login";
		} else {
			loginSuccess(u);
			return SUCCESS;
		}
	}
	//登录成功处理方法向Session和Cookie中写入用户id （ifautologin点钩了）
	public void loginSuccess(User user) {
		if(autoLogin) {
			CookieUtil.setCookie("userKey", user.getId().toString(), 31536000);
		} else {
			CookieUtil.deleteCookie("userKey");
		}
		getSession().setAttribute("userKey", user.getId());
	}
	//登出（删除Session和cookie里面的用户ID）
	public String logOff() throws Exception {
		getSession().removeAttribute("userKey");
		CookieUtil.deleteCookie("userKey");
		return SUCCESS;
	}
	//显示用户信息（用户自己登录后查看个人中心显示的用户信息）
	public String info() throws Exception {
		System.out.println("**************");
		if(getUserInfo() != null) {
			user = userService.getUserById((Integer)getUserInfo());
			if(user != null) 
				return "info";
		}
		return "login";
	}
	
	//添加用户的方法（用户注册 管理员添加用户都用）
	public String add() throws Exception {
		userService.save(user);
		return SUCCESS;
	}
	//修改的时候返回的原始用户信息
	public String viewUpdate() throws Exception {
		user = userService.getUserById(getId());
		return "update";
	}
	//提交修改请求（管理员&用户）
	public String update() throws Exception {
		userService.update(user);
		return SUCCESS;
	}
	//根据ID删除用户信息（管理员）
	public String delete() throws Exception {
		userService.deleteById(getId());
		return SUCCESS;
	}
	//管理员得到所有用户信息
	public String list() throws Exception {
		setPage(userService.getPage(getPageNum(), getPageSize()));
		return "list";
	}
	//管理员得到单个用户信息
	public String detail() throws Exception {
		user = userService.getUserById(getId());
		return "detail";
	}
//访问器方法（以下）
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
