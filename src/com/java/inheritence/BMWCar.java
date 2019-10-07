package com.java.inheritence;

import java.io.IOException;

//inheritence: extends keyword

/**
 * KEYWORDS
 * 1. extends
 * 2. implements
 * 3. super
 * 4.super()
 * CONCEPTS
 * 1. types of inheritence
 * 2. example on mutiple inheritence
 * 3. overriding method  rules.
 * 4. abstract class
 * 5. interface
 * @author pradeep
 *
 */
public class BMWCar extends CarClass implements InterfaceDemo,InterfaceDemo1{
	
	BMWCar()
	{
		super();
	}
	public static void main(String[] args) {
		CarClass bWMCar = new CarClass();
		bWMCar.colour="white";
		System.out.println(bWMCar.colour);
		System.out.println(bWMCar.engineSpeed());
	}
	
	@Override
	int engineSpeed(int input) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("350");
		return super.engineSpeed();
	}
	@Override
	int sayInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String bePatient() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String sayHello1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String bePatient1() {
		// TODO Auto-generated method stub
		return null;
	}

}
