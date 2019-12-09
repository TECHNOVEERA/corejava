package com.corejava.strings;


/**
 * 
 * @author pradeep
 * 
 * CONCEPTS:
 * 1. String: immutable: once object is created cannot be modified 
 * 2. StringBuilder: mutable:can be modified: best practice(use in non multithreaded env)
 * 3.StringBuffer: mutable:can be modified: best practice(use in multithreaded env)equald and hashcode
 * 4. == operator
 * 5. .equals()
 * 6. ovverride equals() and hascode() method of Object class.
 *
 */

    
public class StringsDemo {

	
	private int accountNumber;
    private String userName;
	public static void main(String[] args) {
       //1. String: immutable: once object is created cannot be modified 
		String s= new String("Test");
		System.out.println(s);
		s.concat("Test2");
		System.out.println(s);
		
		//2. StringBuilder: mutable:can be modified: best practice(use in  multithreaded env)
		StringBuffer buffer= new StringBuffer("Test");
		System.out.println(buffer);
		buffer.append("Test2");
		System.out.println(buffer);
		//3.StringBuffer: mutable:can be modified: best practice(use in non multithreaded env)equald and hashcode
		StringBuilder builder= new StringBuilder("Test");
		System.out.println(builder.t);
		builder.append("Test2");
		System.out.println(builder);
	/*
		//4. pre defined string functions
		/*
		 * a. replace char at position 9 in input string
		 * b. chcek size of string
		 * c. check if string starys with 'A'
		 * d. 
		 */
		
		String input="ABCDEFGHIJKLMN";
		System.out.println("conver to lower case"+input.toLowerCase());
		if(input.length()>=10)
		System.out.println("replace char at position 9 in input string with Z"+input.replace(input.charAt(9), 'Z'));
		System.out.println("chcek size of string"+input.length());
		if(input.length()>=7)
		System.out.println("do substring from 4 to 6th index"+input.substring(4, 6));
		System.out.println("take in dex of char 'A' and start doing substring from that index");
		//5..equals() ==  1. equals() will chcek contents of objects are same are not
		//                2. == will check references of the objects are same or not.
		String demo = new String("TEST");
		String demo1 = new String("test");
		demo1=demo;
		System.out.println("equals() demo"+demo.equalsIgnoreCase(demo1));
		System.out.println(demo==demo1);
		
		String input1 = "Green";
		 String[] output=input1.split("");
		
		/*int i=10;
		int j=10;
		//String s="10";
		int k=10;
		System.out.println(s.equals(k));*/
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringsDemo other = (StringsDemo) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
	
	

}
