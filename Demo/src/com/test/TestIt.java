package com.test;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class TestIt{
	
//	static {
//		id=5;
//		name="Atul";
//	}
//
//	private static int id;
//	 private static String name;

	 public static void main(String[] args) {
		String a = new String();
//		 System.out.println(id+" "+name);
		 
		 Date date = new Date();
		 System.out.println(date.getDate());
		 Locale locale = Locale.getDefault();
		 Currency c = Currency.getInstance(locale);
		 System.out.println(locale.getDisplayLanguage());
		 
	}
	 
}
