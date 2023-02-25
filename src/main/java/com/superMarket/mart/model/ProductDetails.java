/**
 * 
 */
package com.superMarket.mart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author kiran
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Details")
public class ProductDetails {
	@Id
	@Column(name = "Product_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "Product_Name")
	String name;
	@Column(name = "MRP")
	float price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JoinColumn(name = "Manufacture_Id")
	ManufactureDetails manufactureDetails;

	public ProductDetails() {

	}

	public ProductDetails(int id,String name,float price,ManufactureDetails manufactureDetails) {
		this.id = id;
		this.name = name;
		this.price =price;
		this.manufactureDetails = manufactureDetails;
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
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the manufactureDetails
	 */
	public ManufactureDetails getManufactureDetails() {
		return manufactureDetails;
	}

	/**
	 * @param manufactureDetails the manufactureDetails to set
	 */
	public void setManufactureDetails(ManufactureDetails manufactureDetails) {
		this.manufactureDetails = manufactureDetails;
	}

}
