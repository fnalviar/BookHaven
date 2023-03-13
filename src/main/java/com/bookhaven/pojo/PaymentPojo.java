package com.bookhaven.pojo;

public class PaymentPojo {

	private int paymentId;
	private String cardType;
	private String cardName;
	private String expirationDate;
	private String cvv;
	private int customerId;
	
	public PaymentPojo() {
		super();
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public PaymentPojo(int paymentId, String cardType, String cardName, String expirationDate, String cvv,
			int customerId) {
		super();
		this.paymentId = paymentId;
		this.cardType = cardType;
		this.cardName = cardName;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "PaymentPojo [paymentId=" + paymentId + ", cardType=" + cardType + ", cardName=" + cardName
				+ ", expirationDate=" + expirationDate + ", cvv=" + cvv + ", customerId=" + customerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((cvv == null) ? 0 : cvv.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + paymentId;
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
		PaymentPojo other = (PaymentPojo) obj;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (customerId != other.customerId)
			return false;
		if (cvv == null) {
			if (other.cvv != null)
				return false;
		} else if (!cvv.equals(other.cvv))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (paymentId != other.paymentId)
			return false;
		return true;
	}
	

}
