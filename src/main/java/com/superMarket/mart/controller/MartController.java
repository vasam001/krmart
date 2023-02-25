/**
 * 
 */
package com.superMarket.mart.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.superMarket.mart.exception.MartServiceException;
import com.superMarket.mart.model.ManufactureDetails;
import com.superMarket.mart.service.ManufatureService;
import com.superMarket.mart.util.ManufactureUtil;

/**
 * @author kiran
 *
 */
@RestController
@RequestMapping("/mart")
public class MartController {
	Log logger = LogFactory.getLog(MartController.class);
	Logger LOGGER = (Logger) LoggerFactory.getLogger( MartController.class);
	@Autowired 
	ManufatureService manufatureService;
	@Autowired
	ManufactureUtil ManufactureUtil;

	@GetMapping("/welcome")
	public String welcome(@RequestParam String name) {
		String message = "welocme to Kr Mart  " + name;
		return message;
	}

	@GetMapping("/welcome/{martName}")
	public String welcomeMart(@PathVariable String martName) {
		String message = "welocme to Mart " + martName;
		return message;
	}

	@PutMapping("/products")
	public String updateProduct() {
		String message = "product updated successfully in application";
		return message;
	}

	@PatchMapping("/products")
	public String updateProductData() {
		String message = "product updated in patch successfully";
		return message;
	}

	@DeleteMapping("/products")
	public String deleteProduct() {
		String message = "product deleted successfully";
		return message;
	}

	@PostMapping("/manufactures")
	public String addManufacture(@RequestBody ManufactureDetails manufactureDetails) {
		if (ManufactureUtil.manufactureDetailsValidation(manufactureDetails)) {
			String message = manufatureService.addManufacture(manufactureDetails);
			return message;
		}
		return "invalid input";

	}

	@GetMapping("/manufactures/{manufactureId}")
	public Optional<ManufactureDetails> manufacture(@PathVariable int manufactureId) throws MartServiceException {
		logger.info("manufacture id "+manufactureId);
		Optional<ManufactureDetails> manufactureDetails = manufatureService.manufacture(manufactureId);
		if(!manufactureDetails.isPresent()) {
			logger.error("No records found in db based on manufacture id : "+manufactureId);
			throw new MartServiceException("No records found in db based on manufacture id : "+manufactureId);
		}
		return manufactureDetails;
	}

	@GetMapping("/manufactures")
	public List<ManufactureDetails> manufacture() {
		List<ManufactureDetails> manufactureDetails = manufatureService.manufacture();
		return manufactureDetails;
	}

	@GetMapping("/manufactures/{manufactureId}/{name}")
	public String manufacture(@PathVariable int manufactureId, @PathVariable String name) {
		String manufactureName = "";
		if (ManufactureUtil.manufactureIdvalidation(manufactureId)) {
			manufactureName = manufatureService.manufacture(manufactureId, name);
		}
		/*
		 * Optional<ManufactureDetails> manufactureDetails =
		 * manufatureService.manufacture(manufactureId);
		 * if(manufactureDetails.isPresent()) { manufactureName =
		 * manufactureDetails.get().getName(); }
		 */
		return manufactureName;
	}

}
