package com.bookhaven.pojo;

import java.sql.Timestamp;

public class CartPojo {
	
	private int cartId;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private boolean isRemoved;
	private double cartTotal;
	private int customerId;
	private int orderId;
	
	public CartPojo() {
		super();
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public CartPojo(int cartId, Timestamp createdDate, Timestamp modifiedDate, boolean isRemoved, double cartTotal,
			int customerId, int orderId) {
		super();
		this.cartId = cartId;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isRemoved = isRemoved;
		this.cartTotal = cartTotal;
		this.customerId = customerId;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "CartPojo [cartId=" + cartId + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", isRemoved=" + isRemoved + ", cartTotal=" + cartTotal + ", customerId=" + customerId + ", orderId="
				+ orderId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		long temp;
		temp = Double.doubleToLongBits(cartTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + customerId;
		result = prime * result + (isRemoved ? 1231 : 1237);
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + orderId;
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
		CartPojo other = (CartPojo) obj;
		if (cartId != other.cartId)
			return false;
		if (Double.doubleToLongBits(cartTotal) != Double.doubleToLongBits(other.cartTotal))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (customerId != other.customerId)
			return false;
		if (isRemoved != other.isRemoved)
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (orderId != other.orderId)
			return false;
		return true;
	}
	
	
}
