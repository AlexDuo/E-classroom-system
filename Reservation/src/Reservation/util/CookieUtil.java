package Reservation.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

public class CookieUtil {
//工具类 其他同学帮助~~

	public static Cookie getCookie(String key) {
		return getCookieFromRequest(getRequest(), key);
	}

	public static String getCookieValue(String key) {
		Cookie cookie = getCookie(key);
		return (cookie == null) ? null : cookie.getValue();
	}

	public static String getCookieValueFromRequest(HttpServletRequest request,
			String key) {
		Cookie cookie = getCookieFromRequest(request, key);
		return (cookie == null) ? null : cookie.getValue();
	}

	public static Cookie getCookieFromRequest(HttpServletRequest request,
			String key) {
		Cookie cookie = null;
		if (!StringUtils.isBlank(key)) {
			Cookie[] cookies = request.getCookies();
			if ((cookies != null) && (cookies.length > 0)) {
				for (int i = 0; i < cookies.length; ++i) {
					cookie = cookies[i];
					if (cookie.getName().equals(key)) {
						return cookie;
					}
				}
			}
		}
		return cookie;
	}

	public static void setCookie(String key, String value, int expiry) {
		Cookie cookie = new Cookie(key, value);
		cookie.setPath("/");
		cookie.setMaxAge(expiry);
		getResponse().addCookie(cookie);
	}

	public static boolean deleteCookie(String key) {
		if (!StringUtils.isBlank(key)) {
			Cookie cookie = getCookie(key);
			if (cookie != null) {
				cookie.setMaxAge(0);
				cookie.setPath("/");
				getResponse().addCookie(cookie);
				return true;
			}
		}
		return false;
	}

	private static HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

	private static HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

}