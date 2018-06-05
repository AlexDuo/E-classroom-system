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
//添加产品方法
	public String add() throws Exception {
		productService.save(product);
		return SUCCESS;
	}
//预览修改产品信息
	public String viewUpdate() throws Exception {
		product = productService.getByProductId(getId());
		return "update";
	}
//修改产品信息
	public String update() throws Exception {
		productService.update(product);
		return SUCCESS;
	}
//根据ID删除产品信息
	public String delete() throws Exception {
		productService.deleteById(getId());
		return SUCCESS;
	}
//查看单个商品信息
	public String detail() throws Exception {
		product = productService.getByProductId(getId());
		return "detail";
	}
//查看商品列表
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
