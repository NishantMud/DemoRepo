package com.test;

import java.util.Scanner;

public class DemoClass {

//	public void method(int a, String b) {
//		System.out.println("inside method");
//	}
	
	public static void main(final String[] args) {
//		
//		int a=10;
//		System.out.println(a/2);
//		float c = 10.5f;
//		
//		DemoClass d = new DemoClass();
//		String b = null;
//		d.method(a, b);
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean leap=true;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) 
					leap=true;
					
				else 
						leap=false;
				
				
		}
			else 
				leap=true;
				
	

	}
		else {
			leap=false;
		}
		if(leap==true) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	

	
	}
}
