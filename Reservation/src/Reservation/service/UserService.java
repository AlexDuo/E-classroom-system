package Reservation.service;

import Reservation.entity.User;
import Reservation.util.bean.Page;

public interface UserService {
	//�����û���Ϣ������Ա��ӣ��û�ע�ᣩ
	public abstract void save(User entity);
	//�����û���Ϣ������Ա&�û���
	public abstract void update(User entity);
	//����Աɾ���û���Ϣ
	public abstract void delete(User entity);
	//����Ա�����û�ID�����û���Ϣ
	public abstract void deleteById(Integer id);
	//����Ա�����û�ID�õ��û���Ϣ���Զ���¼��
	public abstract User getUserById(Integer id);
	//�����û����õ��û���Ϣ
	public abstract User getByUserName(User user);
	//�����û���Ϣ�õ��û��õ��û�������username �� password��
	public abstract User getByUserInfo(User user);
	//����Ա�õ���ǰҳ�û���Ϣ
	public abstract Page getPage(int pageNum, int pageSize);
}
