package com.cg;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = new String();
		s1 = sc.nextLine();
		String s2="";
		String s3 ="";
		//System.out.println(s1.charAt(2));
		//int midLen=(s1.length())/2;
		//System.out.println(midLen);
		
		for(int i = 0; i<s1.length()/2; i++) {
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		for(int j =s1.length()-1; j>s1.length()/2; j--) {
			s3 = s3+s1.charAt(j);
		}
		System.out.println(s3);
		if(s2.equals(s3)) {
			System.out.println("String palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
	}
	
}