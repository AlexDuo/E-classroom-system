package Reservation.action;

import Reservation.entity.UserProduct;
import Reservation.service.UserProductService;

public class UserProductAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserProductService userProductService;
	
	private UserProduct userProduct;
	
	private Integer proId;
	
	private Integer amount;
	
	//�û���Ӷ���������Ʒ�ϵ㹺��͹��ﳵ�������������
	public String add() throws Exception {
		System.out.println(getUserInfo());
		System.out.println(getProId());
		System.out.println(getAmount());
		userProductService.save((Integer)getUserInfo(), getProId(), getAmount());
		return SUCCESS;
	}
	public String detail() throws Exception {
		userProduct = userProductService.getUserProductById(getId());
		return "detail";
	}
	//����Ա�޸��û����ɵĶ��������ض�����Ϣ��
	public String viewUpdate() throws Exception {
		userProduct = userProductService.getUserProductById(getId());
		return "update";
	}
	//ͬ�ϣ��ύ��������ݣ�
	public String update() throws Exception {
		userProductService.update(userProduct);
		return SUCCESS;
	}
	//����Աɾ������
	public String delete() throws Exception {
		userProductService.deleteById(getId());
		return SUCCESS;
	}
	public String signIn() throws Exception {
		System.out.println(getId());
		userProductService.signIn(getId());
		return SUCCESS;
	}
	//����Ա�鿴�����û�����
	public String list() throws Exception {
		setPage(userProductService.getPage(getPageNum(), getPageSize()));
		return "list";
	}
//����������
	public UserProductService getUserProductService() {
		return userProductService;
	}

	public void setUserProductService(UserProductService userProductService) {
		this.userProductService = userProductService;
	}

	public UserProduct getUserProduct() {
		return userProduct;
	}

	public void setUserProduct(UserProduct userProduct) {
		this.userProduct = userProduct;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
