package com.qa.solid;

import java.util.ArrayList;
import java.util.Collection;

import com.qa.solid.depInv.Email;
import com.qa.solid.depInv.Mobile;
import com.qa.solid.depInv.Notifier;
import com.qa.solid.depInv.WeatherTracker;
import com.qa.solid.depInv.EX.BackendDeveloper;
import com.qa.solid.depInv.EX.Developer;
import com.qa.solid.depInv.EX.FrontendDeveloper;
import com.qa.solid.depInv.EX.Project;

public class Runner {

	public static void main(String[] args) {

		// ---------------------- Dependency Inversion ----------------------
		WeatherTracker w = new WeatherTracker();
		Mobile m = new Mobile();
		Email e = new Email();
		w.setConditions("sunny");
		System.out.println("Mobile notification:");
		w.notify(m);
		System.out.println("--------------------");
		System.out.println("Email notification:");
		w.notify(e);
//		ArrayList<? extends Notifier> list = new ArrayList<Notifier>();
//		list.add(e);
//		System.out.println(list.get(0));
		
		// ---------------------- Dependency Inversion Exercise ----------------------
		ArrayList<Developer> dev = new ArrayList<Developer>();
		dev.add(new BackendDeveloper());
		dev.add(new FrontendDeveloper());
		dev.add(new BackendDeveloper());
		Project p = new Project(dev);
		p.implement();

	}

}
