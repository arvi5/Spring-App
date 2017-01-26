package com.edureka.beaninheritance;

public class Book {
	private String name;
	private String author;
	private int noOfPages;
	private float cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String toString() {
		return "Book[name:" + name + ",author:" + author + ",noofPages:" + noOfPages + ",cost:" + cost + "]";

	}

}
