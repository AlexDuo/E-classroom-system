package Reservation.dao;

import Reservation.entity.UserProduct;
import Reservation.util.bean.Page;

public interface UserProductDAO extends BaseDAO<UserProduct> {
	//�޸��������û�����ʱ��
	void updateAmount(UserProduct userProduct);
	//�����û�IDɾ��������������Աɾ��һ���û���ʱ��ɾ�����û��������Ķ�����
	void deleteByUser(Integer userId);
	//���ݲ�ƷIDɾ��������ͬ�ϣ�
	void deleteByProduct(Integer proId);
    //�õ���ǰҳ�Ķ����б�����Ա�鿴���ж���ʱ���list��
	Page getPage(int pageNum, int pageSize);
	//fucked
	Page getPageByStatus(int pageNum, int pageSize, Short status);
	void signIn(Integer proId);
}
