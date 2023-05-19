package com.ashokit.entities;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="OrderDetails")
public class OrderDetails {
	
	@Id
	@Column(name="Order_Id")
	@GenericGenerator(name="order_id_gen",strategy="com.ashokit.generator.OrderIdGenerator")
	@GeneratedValue(generator = "order_id-generator")
	private String orderId;
	@Column(name="Order_By")
	private String orderBy;
	@Column(name="Order_Placed-Date")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(String orderId, String orderBy, Date orderPlacedDate) {
		super();
		this.orderId = orderId;
		this.orderBy = orderBy;
		this.orderPlacedDate = orderPlacedDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
	
}
