package Reservation.dao;

import Reservation.entity.Product;
import Reservation.util.bean.Page;

public interface ProductDAO extends BaseDAO<Product>{
	//�õ���ǰҳ�Ĳ�Ʒ��Ϣ��index�����г��Ĳ�Ʒ��Ϣ��
	public abstract Page getPage(int pageNum, int pageSize);
	//����Ա���²�Ʒ��Ϣ
	public abstract void updateProInfo(Product product);
}
