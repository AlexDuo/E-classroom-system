package Reservation.service.impl;

import Reservation.dao.DAOManager;
import Reservation.entity.Product;
import Reservation.service.ProductService;
import Reservation.util.bean.Page;

public class ProductServiceImpl implements ProductService {

	private DAOManager daoManager;
	
	public void save(Product entity) {
		daoManager.getProductDAO().save(entity);
	}

	public void update(Product entity) {
		daoManager.getProductDAO().updateProInfo(entity);
	}
	
	public Product getByProductId(Integer id) {
		return daoManager.getProductDAO().load(id);
	}
	
	public Page search(int pageNum, int pageSize) {
		return null;
	}

	public void delete(Product entity) {
		daoManager.getProductDAO().delete(entity);
		daoManager.getUserProductDAO().deleteByProduct(entity.getId());
	}

	public void deleteById(Integer id) {
		daoManager.getProductDAO().deleteById(id);
		daoManager.getUserProductDAO().deleteByProduct(id);
	}

	public Page getPage(int pageNum, int pageSize) {
		return daoManager.getProductDAO().getPage(pageNum, pageSize);
	}

	public DAOManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DAOManager daoManager) {
		this.daoManager = daoManager;
	}


}
