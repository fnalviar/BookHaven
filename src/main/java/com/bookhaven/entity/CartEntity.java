package com.bookhaven.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class CartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;
	
	@Column(name = "cart_items")
	private int cartItems;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "modified_date")
	private Timestamp modifiedDate;
	
	@Column(name = "is_removed")
	private boolean isRemoved;
	
	@Column(name = "cart_total")
	private double cartTotal;
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	@Column(name = "customer_id")
	private int customerId;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	@Column(name = "order_id")
	private int orderId;

	public CartEntity() {
		super();
	}

	public CartEntity(int cartId, int cartItems, Timestamp createdDate, Timestamp modifiedDate, boolean isRemoved,
			double cartTotal, int customerId, int orderId) {
		super();
		this.cartId = cartId;
		this.cartItems = cartItems;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isRemoved = isRemoved;
		this.cartTotal = cartTotal;
		this.customerId = customerId;
		this.orderId = orderId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCartItems() {
		return cartItems;
	}

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
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

	@Override
	public String toString() {
		return "CartEntity [cartId=" + cartId + ", cartItems=" + cartItems + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", isRemoved=" + isRemoved + ", cartTotal=" + cartTotal
				+ ", customerId=" + customerId + ", orderId=" + orderId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		result = prime * result + cartItems;
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
		CartEntity other = (CartEntity) obj;
		if (cartId != other.cartId)
			return false;
		if (cartItems != other.cartItems)
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
