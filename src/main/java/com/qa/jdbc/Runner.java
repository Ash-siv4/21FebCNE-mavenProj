package com.qa.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {

	private static Scanner scan = new Scanner(System.in);

	private static String getAction() {
		System.out.println("Enter CRUD operation:");
		return scan.nextLine();
	}

	public static void main(String[] args) throws SQLException {

		// create an instance of the sql class - the constructor is called immediately
		// and connects to the database
		Sql s = new Sql();

		// call the "getAction()" method to ask for the crud operation
		// store what the user enters in the "crud" variable
		String crud = getAction();// may want to convert this toLowerCase since it will be case-sensitive to use inputs

		try {
			// do-while loop so that the switch case runs at least once
			do {
				switch (crud.toLowerCase()) {// example of converting toLowerCase
				case "create":
					System.out.println("enter value for field1: ");
					String f1 = scan.nextLine();
					System.out.println("enter value for field2: ");
					String f2 = scan.nextLine();
					s.create(f1, f2);// call the create method in the sql class and pass in the values stored from user inputs
					break;
				case "update":
					System.out.println("please enter ID to update: ");
					int id = scan.nextInt();
					scan.nextLine();// capture the enter key
					System.out.println("enter value for field1: ");
					String nf1 = scan.nextLine();
					System.out.println("enter value for field2: ");
					String nf2 = scan.nextLine();
					s.update(id, nf1, nf2);
					break;
				case "read":
					s.readAll();
					break;
				case "delete":
					System.out.println("please enter ID to delete: ");
					int delid = scan.nextInt();
					scan.nextLine();// capture the enter key
					s.delete(delid);
					break;
				default:
					System.out.println("invalid option");
				}
				crud = getAction();// may want to convert this toLowerCase since it will be case-sensitive to use inputs
			} while (!crud.equals("exit"));// can also do as "while(!crud.equalsIgnoreCase("exit")
			System.out.println("byeeee");
		} finally {
			// TODO: handle finally clause
			scan.close();// stopping the scanner - to prevent resource leakage
			s.close();// close the connection
		}
	}
}
