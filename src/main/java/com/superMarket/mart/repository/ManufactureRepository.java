/**
 * 
 */
package com.superMarket.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.superMarket.mart.model.ManufactureDetails;

/**
 * @author kiran
 *
 */
@Repository 
public interface ManufactureRepository extends JpaRepository<ManufactureDetails, Integer>{
	@Query(value = "select Manufacture_Name from Manufacture_Details where Manufacture_Id =: manufactureId  and Manufacture_Name =: name", nativeQuery = true)
	/*
	 * @Query(value =
	 * "select Manufacture_Name from Manufacture_Details where Manufacture_Name =: name and Manufacture_Id =: manufactureId"
	 * , nativeQuery = true)
	 * 
	 * @Query(value =
	 * "select Manufacture_Name from Manufacture_Details where Manufacture_Name =?1 and Manufacture_Id =?2"
	 * , nativeQuery = true)
	 */
	String manufactureName(int manufactureId,String name);
}
