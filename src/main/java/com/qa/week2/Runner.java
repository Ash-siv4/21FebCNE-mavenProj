package com.qa.week2;

import com.qa.endOfW2.Move;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Move m;
		
		int[] arr = {0, 1, 2};

		try {
			//trying to do
			System.out.println(arr[5]);//index out of bounds
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("catch");
			System.out.println("index out of bounds");
			System.out.println(arr[1]);
		} catch(NullPointerException e) {
			System.out.println("there is a null value");
		}finally {
			//will happen regardless of try or catch
			System.out.println("finally");
		}
		
	}

}
