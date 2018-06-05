package Reservation.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String proName;
	private Double proPrice;
	private String proIntro;
	private String proStartTime;
	private String proEndTime;
	private Set<UserProduct> userProduct = new HashSet<UserProduct>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProIntro() {
		return proIntro;
	}
	public void setProIntro(String proIntro) {
		this.proIntro = proIntro;
	}
	public Set<UserProduct> getUserProduct() {
		return userProduct;
	}
	public void setUserProduct(Set<UserProduct> userProduct) {
		this.userProduct = userProduct;
	}
	public String getProStartTime() {
		return proStartTime;
	}
	public void setProStartTime(String proStartTime) {
		this.proStartTime = proStartTime;
	}
	public String getProEndTime() {
		return proEndTime;
	}
	public void setProEndTime(String proEndTime) {
		this.proEndTime = proEndTime;
	}

	
}
