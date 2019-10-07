package com.java.accessmodifiers;

/**
 * 
 * @author pradeep
 * 
 * Access Control Modifiers
 * default: same package
 * private:  same class
 * public:  any
 * protected: same pacakge/another packager(if we aplying inheritance)
 * Non-Accerss Control Modifiers
 * static
 * final
 * abstract
 * syncronised,volatile: multithreading(cover later)
 */
public class AcessModifiersDemo1 {
	
	  int i=100;
	  private int j=200;
	  protected int k=300;
	  public int l=400;
	  
	  protected void sayHello()
	  {
		  System.out.println("Hello"+j);
	  }

}
