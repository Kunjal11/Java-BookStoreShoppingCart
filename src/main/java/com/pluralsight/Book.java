package com.pluralsight;

public class Book {
	int id;
	String title;
	String author;
	float price;

	public Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(int id, String title, String author, float price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + title + ", " + author + ", " + price + ")";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		Book book = (Book) object;
		return id == book.id &&
				java.lang.Float.compare(book.price, price) == 0 &&
				title.equals(book.title) &&
				author.equals(book.author);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), id, title, author, price);
	}
}
