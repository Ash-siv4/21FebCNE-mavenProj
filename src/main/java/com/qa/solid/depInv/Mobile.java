package com.qa.solid.depInv;

public class Mobile implements Notifier {
	public void alertWeatherConditions(String conditions) {
		if (conditions.equals("rainy")) {
			System.out.println("It is rainy");
		}
	}
}

	//------------- BEFORE -------------
//public class Mobile {
//  public String generateWeatherAlert(String conditions) {
//      String alert = "It is " + conditions;
//      return alert;
//  }
//}