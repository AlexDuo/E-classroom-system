package Reservation.dao;

import Reservation.entity.User;
import Reservation.util.bean.Page;

public interface UserDAO extends BaseDAO<User> {
	//�����û���Ϣ���û�&����Ա��
	public abstract void updateUserInfo(User user);
	//�����û���
	public abstract User getByUserName(User user);
	//����Username��Password�õ��û�
	public abstract User getByUserInfo(User user);
	//�õ���ǰҳ���û��б�����Ա�ã�
	public abstract Page getPage(int pageNum, int pageSize);
}
