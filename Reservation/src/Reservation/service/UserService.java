package Reservation.service;

import Reservation.entity.User;
import Reservation.util.bean.Page;

public interface UserService {
	//保存用户信息（管理员添加，用户注册）
	public abstract void save(User entity);
	//更新用户信息（管理员&用户）
	public abstract void update(User entity);
	//管理员删除用户信息
	public abstract void delete(User entity);
	//管理员根据用户ID产出用户信息
	public abstract void deleteById(Integer id);
	//管理员根据用户ID得到用户信息（自动登录）
	public abstract User getUserById(Integer id);
	//根据用户名得到用户信息
	public abstract User getByUserName(User user);
	//根据用户信息得到用户得到用户（根据username 和 password）
	public abstract User getByUserInfo(User user);
	//管理员得到当前页用户信息
	public abstract Page getPage(int pageNum, int pageSize);
}
