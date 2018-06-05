package Reservation.action;

import Reservation.entity.Product;
import Reservation.service.ProductService;

public class ProductAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductService productService;
	
	private Product product;
	
	public String viewAdd() throws Exception {
		return "add";
	}
//��Ӳ�Ʒ����
	public String add() throws Exception {
		productService.save(product);
		return SUCCESS;
	}
//Ԥ���޸Ĳ�Ʒ��Ϣ
	public String viewUpdate() throws Exception {
		product = productService.getByProductId(getId());
		return "update";
	}
//�޸Ĳ�Ʒ��Ϣ
	public String update() throws Exception {
		productService.update(product);
		return SUCCESS;
	}
//����IDɾ����Ʒ��Ϣ
	public String delete() throws Exception {
		productService.deleteById(getId());
		return SUCCESS;
	}
//�鿴������Ʒ��Ϣ
	public String detail() throws Exception {
		product = productService.getByProductId(getId());
		return "detail";
	}
//�鿴��Ʒ�б�
	public String list() throws Exception {
		setPage(productService.getPage(getPageNum(), getPageSize()));
		return "list";
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
