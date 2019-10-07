//1-package: optional/mandatory: MANDATORY
//com.<companyName>.<projectname>.<majormodule>.<minormodule>.<concept>
package com.java.basics;

import java.util.ArrayList;
//2-import statements
import java.util.List;


//3-class
public class Bank {
	
	//instance variables
	 static int i;
	 static String s;
	
	//local vraibales
	
	//static variables
	  static  int j;
	//4-constructor
	/* */
	 Bank()
	 {
		 
		 System.out.println("My name is default constructor");
	 }
	 
	 Bank(String customName)
	 {
		 System.out.println("I am a parameterised constructor and my anme is :"+customName);
	 }
	 Bank(int i)
	 {
		int g=100;
		System.out.println(g);
	 }
	 Bank(int i,String s)
	 {
		 Bank.i=i;
		 Bank.s=s;
	 }
	 //static
	 {
		 System.out.println("This is a test block");
	 }
	
	// Declare some variables
	static int accountNumber;
	static String userName="Scott";
	//Function: it should have a return type
	         String displayBankDetails()
	      {
	        	 
	        	 System.out.println(i+":"+s);
	        	 return "";
	    	  
	      }
	 //F6- executes current line and line by line
	 //F5- call internal functions
	 //F8-skip break points.
	        
	       
	//this is a point of entry for java program
	public static void main(String[] args) {
		//System.out.println("Hello");
		//Bank bank =  new Bank("Bank Of America");
		//Bank bankDefaultConstructir =  new Bank();
		Bank xyz = new Bank(100, "Test");
		Bank jjj = new Bank(100, "Test");
		//System.out.println(bank.displayBankDetails());
		//System.out.println(bankDefaultConstructir.displayBankDetails());
	}

}
