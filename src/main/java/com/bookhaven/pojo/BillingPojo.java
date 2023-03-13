package com.bookhaven.pojo;

public class BillingPojo {

	private int billId;
	private String streetName;
	private int streetNumber;
	private String city;
	private String province;
	private String postalCode;
	private int customerId;
	private int orderId;
	
	public BillingPojo() {
		super();
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public BillingPojo(int billId, String streetName, int streetNumber, String city, String province, String postalCode,
			int customerId, int orderId) {
		super();
		this.billId = billId;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.customerId = customerId;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "BillingPojo [billId=" + billId + ", streetName=" + streetName + ", streetNumber=" + streetNumber
				+ ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + ", customerId="
				+ customerId + ", orderId=" + orderId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billId;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + customerId;
		result = prime * result + orderId;
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + streetNumber;
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
		BillingPojo other = (BillingPojo) obj;
		if (billId != other.billId)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (customerId != other.customerId)
			return false;
		if (orderId != other.orderId)
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetNumber != other.streetNumber)
			return false;
		return true;
	}

	
	
}
