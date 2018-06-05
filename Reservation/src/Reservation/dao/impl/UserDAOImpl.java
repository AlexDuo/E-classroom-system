package Reservation.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import Reservation.dao.UserDAO;
import Reservation.entity.User;
import Reservation.util.bean.Page;

public class UserDAOImpl extends BaseDAOImpl<User> implements UserDAO {

	protected Class<User> getEntityClass() {
		return User.class;
	}
	
	public void updateUserInfo(User user) {
		String hql = "update User user set user.userName=:userName, user.password=:password, " +
				"user.phone=:phone, user.email=:email, user.addr=:addr where user.id=:id";
		Query query = getSession().createQuery(hql)
				.setParameter("userName", user.getUserName())
				.setParameter("password", user.getPassword())
				.setParameter("phone", user.getPhone())
				.setParameter("email", user.getEmail())
				.setParameter("addr", user.getAddr())
				.setParameter("id", user.getId());
		query.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public User getByUserName(User user) {
		String hql = "from User u where u.userName=?";
		List<User> result = getHibernateTemplate().find(hql, user.getUserName());
		if(result.size() > 0) 
			return result.get(0);
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public User getByUserInfo(User user) {
		String hql = "from User u where u.userName=? and u.password=?";
		List<User> result = getHibernateTemplate().find(hql, new Object[]{
				user.getUserName(), user.getPassword()});
		if(result.size() > 0) 
			return result.get(0);
		 else 
			return null;
	}

	@SuppressWarnings("unchecked")
	public Page getPage(int pageNum, int pageSize) {
		Criteria criteria = getSession().createCriteria(getEntityClass());
		List<User> data = criteria.setFirstResult(Page.countOffset(pageSize, pageNum)).setMaxResults(pageSize).list();
		return new Page(getTotalRow(), pageNum, pageSize, data);
	}

}
