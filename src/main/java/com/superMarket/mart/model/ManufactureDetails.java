/**
 * 
 */
package com.superMarket.mart.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author kiran
 *
 */
@Component
@Entity
@Table(name = "Manufacture_Details")
public class ManufactureDetails {
	@Id
	@Column(name = "Manufacture_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "Manufacture_Name")
	String name;
	@Column(name = "Registration_Date")
	String regDate;
	@OneToMany(mappedBy = "manufactureDetails",cascade = CascadeType.ALL)
	Set<ProductDetails> products = new HashSet<>();

	public ManufactureDetails() {

	}

	public ManufactureDetails(int id, String name, String regDate, Set<ProductDetails> products) {
		this.id = id;
		this.name =name;
		this.regDate = regDate;
		this.products = products;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the products
	 */
	public Set<ProductDetails> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<ProductDetails> products) {
		this.products = products;
		for(ProductDetails  productDetails : products) {
			productDetails.setManufactureDetails(this);
        }
	}

}
