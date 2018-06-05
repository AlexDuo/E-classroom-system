package Reservation.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import Reservation.dao.ProductDAO;
import Reservation.entity.Product;
import Reservation.util.bean.Page;

public class ProductDAOImpl extends BaseDAOImpl<Product> implements ProductDAO {

	@Override
	protected Class<Product> getEntityClass() {
		return Product.class;
	}
	
	public void updateProInfo(Product product) {
		String hql = "update Product pro set pro.proName=:proName, pro.proPrice=:proPrice, pro.proIntro=:proIntro,"
				+ "pro.proStartTime=:proStartTime, pro.proEndTime=:proEndTime where pro.id=:id";
		Query query = getSession().createQuery(hql)
				.setParameter("proName", product.getProName())
				.setParameter("proPrice", product.getProPrice())
				.setParameter("proIntro", product.getProIntro())
				.setParameter("proStartTime", product.getProStartTime())
				.setParameter("proEndTime", product.getProEndTime())
				.setParameter("id", product.getId());
		query.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public Page getPage(int pageNum, int pageSize) {
		Criteria criertia = getSession().createCriteria(getEntityClass());
		List<Product> data = criertia.setFirstResult(Page.countOffset(pageSize, pageNum)).setMaxResults(pageSize).list();
		return new Page(getTotalRow(), pageNum, pageSize, data);
	}

}
