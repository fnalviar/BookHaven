package com.bookhaven.pojo;

public class BookPojo {

	private int bookId;
	private int ISBN;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	private String coverImage;
	private String sypnosis;
	private double price;
	private boolean isAvailable;
	
	public BookPojo() {
		super();
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getSypnosis() {
		return sypnosis;
	}

	public void setSypnosis(String sypnosis) {
		this.sypnosis = sypnosis;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public BookPojo(int bookId, int iSBN, String title, String authorFirstName, String authorLastName, String coverImage,
			String sypnosis, double price, boolean isAvailable) {
		super();
		this.bookId = bookId;
		ISBN = iSBN;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.coverImage = coverImage;
		this.sypnosis = sypnosis;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", ISBN=" + ISBN + ", title=" + title + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + ", coverImage=" + coverImage + ", sypnosis=" + sypnosis
				+ ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		result = prime * result + ((authorFirstName == null) ? 0 : authorFirstName.hashCode());
		result = prime * result + ((authorLastName == null) ? 0 : authorLastName.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((coverImage == null) ? 0 : coverImage.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sypnosis == null) ? 0 : sypnosis.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		BookPojo other = (BookPojo) obj;
		if (ISBN != other.ISBN)
			return false;
		if (authorFirstName == null) {
			if (other.authorFirstName != null)
				return false;
		} else if (!authorFirstName.equals(other.authorFirstName))
			return false;
		if (authorLastName == null) {
			if (other.authorLastName != null)
				return false;
		} else if (!authorLastName.equals(other.authorLastName))
			return false;
		if (bookId != other.bookId)
			return false;
		if (coverImage == null) {
			if (other.coverImage != null)
				return false;
		} else if (!coverImage.equals(other.coverImage))
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (sypnosis == null) {
			if (other.sypnosis != null)
				return false;
		} else if (!sypnosis.equals(other.sypnosis))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
