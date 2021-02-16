package com.qa.intermediate;

public enum Planets {

	Mercury(1,100), Venus(2, 592), Earth(3,53), Mars(4, 655), Jupiter(5,232), Saturn(6,23), 
	Uranus(7, 54), Neptune(8,232);
	
	private Planets(int loc, int mass) {
		this.loc = loc;
		this.mass = mass;
	}

	private final int loc;
	private final int mass;
	
	public int calc() {
		return loc*mass;
	}

	
	
	
}
