package Reservation.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import Reservation.entity.Product;
import Reservation.service.ProductService;
import Reservation.service.UserProductService;
import Reservation.util.CookieUtil;

public class ShopCartAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Product> data;
	
	private ProductService productService;
	
	private UserProductService userProductService;
	//向COOKIE里添加一个商品ID（购物车信息传导介于COOKIE）是向shopcart字符串中添加
	public String add() throws Exception {
		Cookie[] cookies = getRequest().getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("shopcart")) {
					String tmp = CookieUtil.getCookieValue("shopcart");
					tmp  = tmp + "," + getId();
					CookieUtil.setCookie("shopcart", tmp, 31536000);
					return SUCCESS;
				}
			}
		}
		String tmp = "" + getId();
		CookieUtil.setCookie("shopcart", tmp, 31536000);
		return SUCCESS;
	}
    //删除shopcart中的一个商品ID并添加订单（购买时候用的）
	public String clear() throws Exception {
		Cookie[] cookies = getRequest().getCookies();
		String id = String.valueOf(getId());
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("shopcart")) {
					String tmp = CookieUtil.getCookieValue("shopcart");
					String[] str = tmp.split(",");
					StringBuffer sb = new StringBuffer();
					for(int j = 0; j < str.length; j++) {
						if(id.equals(str[j])) {
							continue;
						} else {
							sb.append(str[j]).append(",");
						}
					}
					String finalStr = sb.toString();
					if(finalStr.length() == 0) {
						CookieUtil.setCookie("shopcart", null, 0);
					}
					else {
						finalStr = finalStr.substring(0, finalStr.length() - 1);
						CookieUtil.setCookie("shopcart", finalStr, 31536000);
					}
					userProductService.save((Integer)getUserInfo(), getId(), 1);
					return SUCCESS;
				}
			}
		}
		return SUCCESS;
	}
	//不添加订单直接移除shopcart里面的一个商品ID（删除购物车中的订单）
	public String delete() throws Exception {
		Cookie[] cookies = getRequest().getCookies();
		String id = String.valueOf(getId());
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("shopcart")) {
					String tmp = CookieUtil.getCookieValue("shopcart");
					String[] str = tmp.split(",");
					StringBuffer sb = new StringBuffer();
					for(int j = 0; j < str.length; j++) {
						if(id.equals(str[j])) {
							continue;
						} else {
							sb.append(str[j]).append(",");
						}
					}
					String finalStr = sb.toString();
					if(finalStr.length() == 0) {
						CookieUtil.setCookie("shopcart", null, 0);
					}
					else {
						finalStr = finalStr.substring(0, finalStr.length() - 1);
						CookieUtil.setCookie("shopcart", finalStr, 31536000);
					}
					return SUCCESS;
				}
			}
		}
		return SUCCESS;
	}
	//把所有购物车里面商品全部罗列出来根据（根据COOKIE里面的ID找到相应商品并罗列）
	public String list() throws Exception {
		data = new ArrayList<Product>();
		Cookie[] cookies = getRequest().getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("shopcart")) {
					String tmp = CookieUtil.getCookieValue("shopcart");
					System.out.println("this is the String from list:" + tmp);
					String[] proIds = tmp.split(",");
					for(int j = 0; j < proIds.length; j++) {
						try {
							Product p = productService.getByProductId(Integer.parseInt(proIds[j]));
							data.add(p);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		return "list";
	}

	public List<Product> getData() {
		return data;
	}

	public void setData(List<Product> data) {
		this.data = data;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public UserProductService getUserProductService() {
		return userProductService;
	}

	public void setUserProductService(UserProductService userProductService) {
		this.userProductService = userProductService;
	}
}
