package Reservation.service;

import Reservation.entity.Product;
import Reservation.util.bean.Page;

public interface ProductService {
	//�����Ʒ��Ϣ������Ա�����Ʒ��������)
	public abstract void save(Product entity);
	//����Ա������Ʒ��Ϣ		
	public abstract void update(Product entity);
	//����Աɾ����Ʒ��Ϣ	
	public abstract void delete(Product entity);
	//����IDɾ����Ʒ��Ϣ�����ɾ����
	public abstract void deleteById(Integer id);
	//������ƷID�õ���Ʒ��Ϣ������Ա&�û���
	public abstract Product getByProductId(Integer id);
    //ʱ���ϵ��������ϸ��˵
	public abstract Page search(int pageNum, int pageSize);
	//��¼indexֻ��list������������Ʒ
	public abstract Page getPage(int pageNum, int pageSize);
}
//���󷽷�������Ľӿ� impl�����Ƕ������ӿڵ�ʵ��