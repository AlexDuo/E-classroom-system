package Reservation.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Reservation.dao.BaseDAO;

public abstract class BaseDAOImpl<T extends Serializable> extends HibernateDaoSupport implements BaseDAO<T>{

	protected abstract Class<T> getEntityClass();
	
	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	public void deleteById(Integer id) {
		String hql = "delete from " + getEntityClass().getSimpleName() + " t where t.id = " + id;
		Query query = getSession().createQuery(hql);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public T load(Integer id) {
		return (T) getHibernateTemplate().load(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> loadAll() {
		return getHibernateTemplate().loadAll(getEntityClass());
	}

	public int getTotalRow() {
		return loadAll().size();
	}

}
