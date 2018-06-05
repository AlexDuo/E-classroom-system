package Reservation.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import Reservation.dao.DAOManager;
import Reservation.entity.User;
import Reservation.service.UserService;
import Reservation.util.bean.Page;

public class UserServiceImpl implements UserService {
	
	private DAOManager daoManager;
	
	public void save(User entity) {
		Timestamp time = new Timestamp((new Date()).getTime());
		entity.setRegTime(time);
		daoManager.getUserDAO().save(entity);
	}

	public void update(User entity) {
		daoManager.getUserDAO().updateUserInfo(entity);
	}

	public void delete(User entity) {
		daoManager.getUserDAO().delete(entity);
		daoManager.getUserProductDAO().deleteByUser(entity.getId());
	}

	public void deleteById(Integer id) {
		daoManager.getUserDAO().deleteById(id);
		daoManager.getUserProductDAO().deleteByUser(id);
	}
	
	public User getUserById(Integer id) {
		return daoManager.getUserDAO().load(id);
	}

	public User getByUserName(User user) {
		return daoManager.getUserDAO().getByUserName(user);
	}

	public User getByUserInfo(User user) {
		return daoManager.getUserDAO().getByUserInfo(user);
	}

	public Page getPage(int pageNum, int pageSize) {
		return daoManager.getUserDAO().getPage(pageNum, pageSize);
	}

	public DAOManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DAOManager daoManager) {
		this.daoManager = daoManager;
	}
	
}
