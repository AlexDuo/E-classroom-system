package Reservation.dao;

import java.util.List;


public interface BaseDAO<T extends java.io.Serializable> {
	//T �̳���Serializable
	//������Ϊ�Ƿ�������ɶ���а�
	public abstract void save(T entity);
	//����ͬ��
	public abstract void update(T entity);
	//ɾ��ͬ��
	public abstract void delete(T entity);
	//����IDɾ��ͬ��
	public abstract void deleteById(Integer id);
	//��getbyidһ��
	public abstract T load(Integer id);
	//�г�
	public abstract List<T> loadAll();
	//��������Ϣ������
	public abstract int getTotalRow();
}
