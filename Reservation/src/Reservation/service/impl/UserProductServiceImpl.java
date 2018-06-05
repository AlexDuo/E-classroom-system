package Reservation.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import Reservation.dao.DAOManager;
import Reservation.entity.Product;
import Reservation.entity.User;
import Reservation.entity.UserProduct;
import Reservation.service.UserProductService;
import Reservation.util.bean.Page;

public class UserProductServiceImpl implements UserProductService {

	private DAOManager daoManager;
	
	public void save(Integer userId, Integer proId, Integer amount) {
		UserProduct up = new UserProduct();
		User user = new User();
		user.setId(userId);
		Product product = new Product();
		product.setId(proId);
		Timestamp time = new Timestamp((new Date()).getTime());
		up.setUser(user);
		up.setProduct(product);
		up.setCreateTime(time);
		up.setAmount(amount);
		up.setStatus((short)1);
		daoManager.getUserProductDAO().save(up);
	}

	public void update(UserProduct entity) {
		daoManager.getUserProductDAO().updateAmount(entity);
	}

	public void delete(UserProduct entity) {
		daoManager.getUserProductDAO().delete(entity);
	}

	public void deleteById(Integer id) {
		daoManager.getUserProductDAO().deleteById(id);
	}
	
	public UserProduct getUserProductById(Integer id) {
		return daoManager.getUserProductDAO().load(id);
	}

	public Page getPage(int pageNum, int pageSize) {
		short status = 1;
		return daoManager.getUserProductDAO().getPageByStatus(pageNum, pageSize, status);
	}

	public DAOManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DAOManager daoManager) {
		this.daoManager = daoManager;
	}
	
	public void signIn(Integer id) {
		daoManager.getUserProductDAO().signIn(id);
	}

}
