package Reservation.dao;

import Reservation.entity.Product;
import Reservation.util.bean.Page;

public interface ProductDAO extends BaseDAO<Product>{
	//得到当前页的产品信息（index里面列出的产品信息）
	public abstract Page getPage(int pageNum, int pageSize);
	//管理员更新产品信息
	public abstract void updateProInfo(Product product);
}
