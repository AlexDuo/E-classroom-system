package Reservation.dao;


public class DAOManager {
	
	private UserDAO userDAO;
	private ProductDAO productDAO;
	private UserProductDAO userProductDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	public UserProductDAO getUserProductDAO() {
		return userProductDAO;
	}
	public void setUserProductDAO(UserProductDAO userProductDAO) {
		this.userProductDAO = userProductDAO;
	}
}
