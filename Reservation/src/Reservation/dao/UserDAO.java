package Reservation.dao;

import Reservation.entity.User;
import Reservation.util.bean.Page;

public interface UserDAO extends BaseDAO<User> {
	//更新用户信息（用户&管理员）
	public abstract void updateUserInfo(User user);
	//根据用户名
	public abstract User getByUserName(User user);
	//根据Username和Password得到用户
	public abstract User getByUserInfo(User user);
	//得到当前页的用户列表（管理员用）
	public abstract Page getPage(int pageNum, int pageSize);
}
