/**
 * 
 */
package com.superMarket.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superMarket.mart.model.ProductDetails;

/**
 * @author kiran
 *
 */
@Repository
public interface ProductsRepository  extends JpaRepository<ProductDetails, Integer>{

}
