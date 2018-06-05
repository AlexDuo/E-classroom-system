package Reservation.service;

import Reservation.entity.Product;
import Reservation.util.bean.Page;

public interface ProductService {
	//保存产品信息（管理员添加商品点击保存后)
	public abstract void save(Product entity);
	//管理员更新商品信息		
	public abstract void update(Product entity);
	//管理员删除商品信息	
	public abstract void delete(Product entity);
	//根据ID删除商品信息（点击删除）
	public abstract void deleteById(Integer id);
	//根据商品ID得到商品信息（管理员&用户）
	public abstract Product getByProductId(Integer id);
    //时间关系不予以详细诉说
	public abstract Page search(int pageNum, int pageSize);
	//登录index只有list出来的所有商品
	public abstract Page getPage(int pageNum, int pageSize);
}
//抽象方法，定义的接口 impl西面是对上述接口的实现