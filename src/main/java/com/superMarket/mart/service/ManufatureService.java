/**
 * 
 */
package com.superMarket.mart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.superMarket.mart.exception.MartServiceException;
import com.superMarket.mart.model.ManufactureDetails;

/**
 * @author kiran
 *
 */
@Component
public interface ManufatureService {
	public String addManufacture(ManufactureDetails manufactureDetails);
	public Optional<ManufactureDetails> manufacture(int manufactureId) throws MartServiceException;
	public List<ManufactureDetails> manufacture();
	public String manufacture(int manufactureId, String name);
}
