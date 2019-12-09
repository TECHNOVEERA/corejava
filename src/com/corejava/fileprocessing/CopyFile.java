package com.corejava.fileprocessing;
//
import java.io.*;

/**
 * 
 * @author pradeep
   dateOfCreation: Oct 11, 2019
   I/O Streams
       -->Byte Streams :handle I/O of raw binary data.
       -->Character Streams: handle I/O of character data, automatically handling translation to and from the local character set.
       -->Buffered Streams: optimize input and output by reducing the number of calls to the native API.
       -->Scanning and Formatting :allows a program to read and write formatted text.
       -->I/O from the Command Line: describes the Standard Streams and the Console object.
       --->Data Streams: handle binary I/O of primitive data type and String values.
       --->Object Streams: handle binary I/O of objects.
 *
 */
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      /*
      String desktop = System.getProperty ("user.home") + "/Desktop/";
      
      File myFile = new File (desktop + "MyFile.txt");
      */
        String desktop = System.getProperty ("user.home") + "/Desktop/";
         File input = new File (desktop + "input.txt");
         File output = new File (desktop + "output.txt");
      try {
         in = new FileReader(input);
         out = new FileWriter(output);
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
