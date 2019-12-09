package com.corejava.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;


/**
 * 1. how to use try-catch-finally combinations
 * 2. how to use throws keyword
 * 3. how to write your own custom exceptions
 * 4. how to use throw keyword
 * 5. checked(COMPILE TIME) exceptions vs unchecked (RUNTIME) exceptions
 * 
 *
 */
public class CheckedUncheckedExceptionsDemo {
    //add below line of code in all new java classes and change your clAS  NAME 
	final static Logger logger = Logger.getLogger(CheckedUncheckedExceptionsDemo.class);
	/* try-catch :GOOD
	 * try-finally:GOOD
	 * try-catch-catch-catch-finally:GOOD
	 * try-catch-finally:GOOD
	 * only try:compiler error
	 * only catch:compiler error
	 * only finally:compiler error
	 */
   public static void main(String args[]) throws IOException  {		
	   FileReader fr=null;
	   //not a good practice
      try {
    	  try
    	  {
    		  
    	  }
    	  catch(Exception e)
    	  {
    		  try{
    			  
    		  }
    		  catch(Exception e1)
    		  {
    			  
    		  }
    	  }
    	  logger.info("inside CheckedUncheckedExceptionsDemo class");
    	  logger.warn("inside CheckedUncheckedExceptionsDemo class");
    	  
    	  File file = new File("E://file.txt");
		fr = new FileReader(file);
		
		
	} 
      catch(FileNotFoundException ex)
      {
    	  //read about log4j
    	  //System.out.println("something went wrong in file processing:"+ex.getStackTrace());
    	  logger.error("something went wrong in file processing:"+ex.getStackTrace());
      }
      catch(Exception exe)
      {
    	  logger.fatal("inside CheckedUncheckedExceptionsDemo class");
      
   }
      finally
      {
    	  fr.close();
      }
}
   
}
