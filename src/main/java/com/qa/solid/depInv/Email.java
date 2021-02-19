package com.qa.solid.depInv;

public class Email implements Notifier {
	public void alertWeatherConditions(String conditions) {
		if (conditions.equals("sunny")) {
			System.out.println("It is sunny");
		}
	}
}

	//------------- BEFORE -------------
//public class Email {
//	public String generateWeatherAlert(String conditions) {
//		String alert = "It is " + conditions;
//		return alert;
//	}
//}