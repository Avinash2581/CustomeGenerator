package com.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.OrderDetails;
import com.ashokit.repository.OrderDetailsRepository;

@SpringBootApplication
public class DataJpaCustomgeneratorApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(DataJpaCustomgeneratorApplication.class, args);
	OrderDetailsRepository bean = context.getBean(OrderDetailsRepository.class);
	OrderDetails entity = new OrderDetails();
	entity.setOrderBy("Avinash");
	entity.setOrderPlacedDate(new Date());
	
	OrderDetails	se =bean.save(entity);
	
	System.out.println(se);
	context.close();
	}

}
