/**
 * 
 */
package com.superMarket.mart.util;

import org.springframework.stereotype.Component;

import com.superMarket.mart.model.ManufactureDetails;
import com.superMarket.mart.model.ProductDetails;

/**
 * @author kiran
 *
 */
@Component
public class ManufactureUtil {
	public boolean manufactureIdvalidation(int manufactureId) {
		if(manufactureId >= 0)
			return true;
		else
			return false;
	}
	public boolean manufactureDetailsValidation(ManufactureDetails manufactureDetails) {
		if(manufactureDetails.getName().length()<5)
			return false;
		else if(manufactureDetails.getRegDate().length() == 10) {
			return false;
		}
		else if(manufactureDetails.getProducts().size()>0) {
			for(ProductDetails productDetails : manufactureDetails.getProducts()) {
				if(productDetails.getName().length()<5)
					return false;
				else if(productDetails.getPrice() < 0.0)
					return false;
			}
		}
		return true;
	}


}
