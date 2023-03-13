package com.bookhaven.pojo;

import java.sql.Timestamp;

public class OrdersPojo {

	private int orderId;
	private Timestamp orderTimestamp;
	private double orderTotal;
	private int customerId;
	
	public OrdersPojo() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public OrdersPojo(int orderId, Timestamp orderTimestamp, double orderTotal, int customerId) {
		super();
		this.orderId = orderId;
		this.orderTimestamp = orderTimestamp;
		this.orderTotal = orderTotal;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderTimestamp=" + orderTimestamp + ", orderTotal=" + orderTotal
				+ ", customerId=" + customerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + orderId;
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
		OrdersPojo other = (OrdersPojo) obj;
		if (customerId != other.customerId)
			return false;
		if (orderId != other.orderId)
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
