package Reservation.action;//All Actions inherit the BaseAction

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import Reservation.util.bean.Page;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Page page;
	
	private String URL;
	
	private Integer pageNum = 0;
	
	private Integer pageSize = 10;
	
	public String exeucte() throws Exception {
		return SUCCESS;
	}
	
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	
	public HttpSession getSession() {
		return ServletActionContext.getRequest().getSession();
	}
	
	public Object getUserInfo() {
		
		return getSession().getAttribute("userKey");
	}
	
	public String getPageUrl() {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		StringBuffer basePath = new StringBuffer();
		basePath.append(request.getScheme())
			.append("://")
			.append(request.getServerName())
			.append(":").append(request.getServerPort())
			.append(request.getContextPath())
			.append(request.getServletPath());
		
		return basePath.toString();
	}
//向值栈中设值
	public void setValueStack(String key, String value) {
		ActionContext.getContext().getValueStack().set(key, value);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
