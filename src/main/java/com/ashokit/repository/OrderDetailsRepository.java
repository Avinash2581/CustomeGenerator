 package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Serializable> {

	
}
