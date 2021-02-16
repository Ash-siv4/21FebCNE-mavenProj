package com.qa.intermediate;

public enum Menu {

	FOOD(1), DRINK(2), STARTER(3), SOUPS(4), DESSERTS(5);

	private final int option;

	private Menu(int option) {
		this.option = option;
	}

	public String section() {
		return "option" + option;
	}

}
