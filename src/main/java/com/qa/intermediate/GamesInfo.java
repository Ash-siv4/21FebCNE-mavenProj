package com.qa.intermediate;

public class GamesInfo {

	private String title;
	private double price;

	@Override
	public String toString() {
		return "GamesInfo [title=" + title + ", price=" + price + "]";
	}

	public GamesInfo(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
