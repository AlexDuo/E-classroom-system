package Reservation.service;

import Reservation.entity.UserProduct;
import Reservation.util.bean.Page;

public interface UserProductService {
	//�û���Ӷ���
	void save(Integer userId, Integer proId, Integer amount);
	//����Ա�޸Ķ���
	void update(UserProduct entity);
	//����Աɾ������
	void delete(UserProduct entity);
	//����Ա����IDɾ������
	void deleteById(Integer id);
	//����Ա���ݶ���ID�õ�����
	UserProduct getUserProductById(Integer id);
	//�õ���ǰҳ������ֻ��ʾ��
	Page getPage(int pageNum, int pageSize);
	void signIn(Integer id);
}
