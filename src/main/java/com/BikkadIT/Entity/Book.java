package com.BikkadIT.Entity;

public class Book {
	private  int bookId;
	private String name;
	private double bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", bookPrice=" + bookPrice + "]";
	}
	public Book(int bookId, String name, double bookPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
