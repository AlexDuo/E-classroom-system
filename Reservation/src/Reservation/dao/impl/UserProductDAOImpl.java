package Reservation.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import Reservation.dao.UserProductDAO;
import Reservation.entity.UserProduct;
import Reservation.util.bean.Page;

public class UserProductDAOImpl extends BaseDAOImpl<UserProduct> implements
		UserProductDAO {

	@Override
	protected Class<UserProduct> getEntityClass() {
		// TODO Auto-generated method stub
		return UserProduct.class;
	}
	
	public void updateAmount(UserProduct userProduct) {
		String hql = "update UserProduct up set up.amount=:amount where up.id=:id";
		getSession().createQuery(hql)
			.setParameter("amount", userProduct.getAmount())
			.setParameter("id", userProduct.getId())
			.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public Page getPageByStatus(int pageNum, int pageSize, Short status) {
		Criteria criteria = getSession().createCriteria(getEntityClass());
		List<UserProduct> data = 
			criteria.add(Restrictions.eq("status", status))
			.setFirstResult(Page.countOffset(pageSize, pageNum))
			.setMaxResults(pageSize).list();
		return new Page(getTotalRow(), pageNum, pageSize, data);
	}
	
	@SuppressWarnings("unchecked")
	public Page getPage(int pageNum, int pageSize) {
		Criteria criteria = getSession().createCriteria(getEntityClass());
		List<UserProduct> data = 
			criteria.setFirstResult(Page.countOffset(pageSize, pageNum))
			.setMaxResults(pageSize).list();
		return new Page(getTotalRow(), pageNum, pageSize, data);					
	}

	public void deleteByUser(Integer userId) {
		String sql = "delete from UserProduct up where user.id=:userId";
		Query query = getSession().createQuery(sql).setParameter("userId", userId);
		query.executeUpdate();
	}

	public void deleteByProduct(Integer proId) {
		String sql = "delete from UserProduct up where product.id=:proId";
		Query query = getSession().createQuery(sql).setParameter("proId", proId);
		query.executeUpdate();
	}

	public void signIn(Integer proId) {
		String hql = "update UserProduct up set up.hours=up.hours+1, up.lastDay=:time where up.id=:id";
		Query query = getSession().createQuery(hql)
			.setParameter("id", proId)
			.setParameter("time", new java.sql.Date(new java.util.Date().getTime()).toString());
		query.executeUpdate();
	}
}
