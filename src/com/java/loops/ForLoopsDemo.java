package com.java.loops;

public class ForLoopsDemo {

	   public static void main(String args[]) {
		  //integer array 
	      int [] numbers = {10, 20, 30, 40, 50};

	      /**for(int i=0;i<numbers.length;i++)
	      {
	    	  System.out.print( numbers[i]);
	    	  
	      }**/
	      //introduced from java5
	      for(int number : numbers ) {
	         System.out.print( number );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	      String [] names = {"James", "Larry", "Tom", "Lacy"};

	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	   }
	};;
