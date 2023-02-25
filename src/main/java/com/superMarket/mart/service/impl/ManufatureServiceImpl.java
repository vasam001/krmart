/**
 * 
 */
package com.superMarket.mart.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;

import com.superMarket.mart.exception.MartServiceException;
import com.superMarket.mart.model.ManufactureDetails;
import com.superMarket.mart.model.ProductDetails;
import com.superMarket.mart.repository.ManufactureRepository;
import com.superMarket.mart.service.ManufatureService;

/**
 * @author kiran
 *
 */
@Service
public class ManufatureServiceImpl implements ManufatureService{
	@Autowired
	private ManufactureRepository manufactureRepository;
	
	@Value("${applalication.Name}")
	String applalicationName;
	@Value("${welcomeurl}")
	String url;
	
	@Override
	public String addManufacture(ManufactureDetails manufactureDetails) {
		String message = "successfully inserted";
		try {
			manufactureRepository.save(manufactureDetails);
		}catch (Exception e) {
			message = e.getMessage();
		}
		return message;
		
	}
	@Override
	public Optional<ManufactureDetails> manufacture(int manufactureId) throws MartServiceException{
		Optional<ManufactureDetails> manufactureDetails = manufactureRepository.findById(manufactureId);
		if(manufactureDetails.isPresent()) {
			return  manufactureDetails;
		}
		else {
			throw new MartServiceException();
		}
	}
	@Override
	public List<ManufactureDetails> manufacture() {
		List<ManufactureDetails> manufactureDetails = manufactureRepository.findAll();
		return manufactureDetails;
	}
	@Override
	public String manufacture(int manufactureId, String name) {
		String manufactureName = manufactureRepository.manufactureName(manufactureId,name);
		return manufactureName;
	}
	
}
