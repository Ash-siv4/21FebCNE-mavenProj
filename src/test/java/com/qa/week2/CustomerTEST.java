package com.qa.week2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTEST {
	
	Customer cust = new Customer();
	
	@BeforeClass
	public static void start() {
		System.out.println("Before Class");
		//setting up connection to a database
	}
	
	@Before
	public void preTest() {
		System.out.println("Before");
		//initialise test data
		cust.setName("eeyore");
		cust.setAge(3);
	}
	
	@Test
	public void addTest() {
		System.out.println("Test");
		assertEquals(9,cust.add(3, 6));
		assertEquals(465,cust.add(453, 12));

		//testing
	}
	
	@Test
	public void testGET() {
		System.out.println("Test 2");
		assertEquals("eeyore",cust.getName());
		//testing
	}
	
	@Test
	public void testToString() {
		System.out.println("Test 3");
		assertEquals("Customer [name=eeyore, age=3]",cust.toString());
		//testing
	}
	
	@After
	public void postTest() {
		System.out.println("After");
		//remove/clear data
	}
	
	@AfterClass
	public static void end() {
		System.out.println("After Class");
		//stop the connection
	}
	
}
