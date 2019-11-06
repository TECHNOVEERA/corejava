package com.java.accessmodifiers;

/**
 * 
 * @author pradeep
 * 
 * keywords: default,public,private,protected
 * 
 * Access Control Modifiers
 * default: same package
 * private:  same class
 * public:  any
 * protected: same pacakge/another packager(if we aplying inheritance that class extends the parent class)
 * Non-Accerss Control Modifiers
 * static
 * final
 * abstract
 * syncronised,volatile: multithreading(cover later)
 */
public class AcessModifiersDemo1 {
	
	  //variables
	  int i=100;
	  private int j=200;
	  protected int k=300;
	  public int l=400;
	  static AcessModifiersDemo1 acessModifiersDemo1;
	  
	  //constructor
	  public AcessModifiersDemo1()
	  {
		  System.out.println("inside AcessModifiersDemo1 constructor"+j);
	  }
	  //singleton design pattern
	  public static AcessModifiersDemo1 getInstance()
	  {
		  if(acessModifiersDemo1==null)
		  {
			  return new AcessModifiersDemo1(); 
		  }
		  else
		  {
			  return acessModifiersDemo1;
		  }
		  
	  }
	  //functions
	  public  String sayHello()
	  {
		  return "Hello";
	  }
	  private String privateFunction()
	  {
		  return "inside private function";
	  }
	  
	   String defaultFunction()
	  {
		  return "inside default function";
	  }
	  
	  protected String protectedFunction()
	  {
		  return "inside protected function::"+privateFunction();
	  }

}
