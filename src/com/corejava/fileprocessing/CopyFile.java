package com.corejava.fileprocessing;

import java.io.*;
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
