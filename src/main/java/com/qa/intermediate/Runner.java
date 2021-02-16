package com.qa.intermediate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
	
	public static Logger LOGGER = LogManager.getLogger();
	final int a = 3;
	
	public static void main(String[] args) {
		
		//Enums
		
		System.out.println(Menu.FOOD.section());
		System.out.println(Planets.Earth.calc());
		
		//Generics
		
		Generic<Integer,String> a = new Generic<Integer,String>(4,"HELLO");
		System.out.println(a.getA()+3);//INT
		System.out.println(a.getB()+3);//STRING

		//Loggers
		
		LOGGER.info("Hello World");
		LOGGER.debug("debugging");
		LOGGER.error("major error");
		LOGGER.fatal("fatal");
		
	}
}
