/**
 * 
 */
package com.superMarket.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superMarket.mart.model.LoginDetails;

/**
 * @author kiran
 *
 */
@Repository
public interface LoginRepository extends JpaRepository<LoginDetails, Integer> {

}
