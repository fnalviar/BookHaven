package com.bookhaven.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrdersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "order_items ")
	private int orderItems;
	
	@Column(name = "order_timestamp")
	private Timestamp orderTimestamp;
	
	@Column(name = "order_total")
	private double orderTotal;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customerEntity;

	public OrdersEntity() {
		super();
	}

	public OrdersEntity(int orderId, int orderItems, Timestamp orderTimestamp, double orderTotal,
			CustomerEntity customerEntity) {
		super();
		this.orderId = orderId;
		this.orderItems = orderItems;
		this.orderTimestamp = orderTimestamp;
		this.orderTotal = orderTotal;
		this.customerEntity = customerEntity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(int orderItems) {
		this.orderItems = orderItems;
	}

	public Timestamp getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Timestamp orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	@Override
	public String toString() {
		return "OrdersEntity [orderId=" + orderId + ", orderItems=" + orderItems + ", orderTimestamp=" + orderTimestamp
				+ ", orderTotal=" + orderTotal + ", customerEntity=" + customerEntity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerEntity == null) ? 0 : customerEntity.hashCode());
		result = prime * result + orderId;
		result = prime * result + orderItems;
		result = prime * result + ((orderTimestamp == null) ? 0 : orderTimestamp.hashCode());
		long temp;
		temp = Double.doubleToLongBits(orderTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdersEntity other = (OrdersEntity) obj;
		if (customerEntity == null) {
			if (other.customerEntity != null)
				return false;
		} else if (!customerEntity.equals(other.customerEntity))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderItems != other.orderItems)
			return false;
		if (orderTimestamp == null) {
			if (other.orderTimestamp != null)
				return false;
		} else if (!orderTimestamp.equals(other.orderTimestamp))
			return false;
		if (Double.doubleToLongBits(orderTotal) != Double.doubleToLongBits(other.orderTotal))
			return false;
		return true;
	}
	
}
