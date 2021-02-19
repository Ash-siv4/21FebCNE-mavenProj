package com.qa.endOfW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		
		//------------- Hash SETS
		HashSet<String> cars = new HashSet<>();
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Nobel");
		cars.add("zonda");
		//duplicates not allowed
		cars.add("Ford");
		System.out.println(cars);
		//check if empty -> boolean
		cars.isEmpty();
		//get something out -> boolean
		cars.contains("Ferrari");
		
		//------------- Hash maps
		HashMap<String, String> capitalcity = new HashMap<>();
		//(key,value) --> key must be unique
		capitalcity.put("France","Paris");
		capitalcity.put("Germany","Berlin");
		capitalcity.put("Japan","Tokyo");
		//duplicates not allowed
		capitalcity.put("Japan","Paris");
		System.out.println(capitalcity);
		System.out.println(capitalcity.size());
		System.out.println(capitalcity.get("France"));
		
		//LAMBDAS - parameters, body
		//method - name, parameters, body, return type
		// (par1,par2) -> one line of code
		// (par1,par2) -> {many lines of code}
		
		Lambda<Integer> ref = (a, b) -> a + b;
		System.out.println(ref.calc(3, 5));
		
		Lambda<Integer> ref2 = (a, b) -> (a + b)*21;
		System.out.println(ref2.calc(53, 3));
		
		Lambda<Integer> temp = (par1,par2) -> {
			if(par1<30)
				return par1;
			else
				return par2;
		};
		System.out.println(temp.calc(34, 3));
		
		//Streams
		List<Integer> list = Arrays.asList(2,4,5,53);
		list.stream().forEach(x -> System.out.println(x*x));
		
		List<String> list1 = Arrays.asList("Winnie","Piglet","Tony","Tim");
		List<String> res = list1.stream().filter(x -> x.startsWith("T")).collect(Collectors.toList());
		System.out.println(res);
		
//		combining SCANNERS, LOGGERS, GENERICS, INTERFACES & LAMBDAS
//		Scanner sc = new Scanner(System.in); //instantiate an object of the SCANNER class 
//		LOGGER.info("Please enter the current temperature: "); 
//		int val = sc.nextInt(); //scan for an integer the user enters
//		int change = 0; //initialise 'change' variable
//		//'Lam' is an interface which uses 2 generics - the types(must be non-primitives) are declared in <> 
//		// lambda section: (parameter1,parameter2) -> { *code* };
//		Lam<Integer,Integer> t = (par1, par2) -> {
//			par2 = 30 - par1;
//			int out = par1 + par2;
//			if(par1<30)
//				LOGGER.info("Increased temperature by: " + par2);
//			else
//				LOGGER.info("Decreased temperature by: " + par2);
//			LOGGER.info("New temperature is: " + out);
//			return par1;//must have return if lambda is working with a block of code
//		};
//		//No return required if no '{}' used, e.g: (a) -> a+3 
//		LOGGER.info("Original temp was: " + t.temp(val, change));//must call the abstract method from the interface to run the lambda expression
		
		
	}
}
