package com.corejava.ternaryoperartor;

public class TernaryOperatorDemo {

	public TernaryOperatorDemo() {

	}
	
	public static void main(String[] args) {
		
		int x=10;
		if(x<20)
		{
			System.out.println("X less than 20");
		}
		else if(x>20)
		{
			System.out.println("X greater than 20");
		}
		else if(x>=20)
		{
			System.out.println("X greater than  equal to 20");
		}
		else
		{
			System.out.println("iam in in else: which is default");
		}
		
		
		//ternary sysntax exp?<if exp true execute this>:<if exp  false execute this>
		System.out.println(x<20?"X less than 20":(x>20?"X greater than 20":(x>=20?"X greater than  equal to 20":"iam in in else: which is default")));
		
	}

}
