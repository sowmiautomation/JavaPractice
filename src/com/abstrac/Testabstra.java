package com.abstrac;


import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Testabstra {

	public static void main(String[] args) {
	   Car a= new Car();
	   BMW b= new BMW();
	   Car c= new BMW();
	    /*r.display();
	    r.display(10, 20);
	    r.print();
	   
	   c.print();
	   a.print();
	   b.print();*/
	   readFile();
	   
	}
	
	public static void readFile() {
		try {
		      File myObj = new File("C:\\Test.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } /*catch (FileNotFoundException e) {
		      System.out.println("An error occurred.- FO");
		      e.printStackTrace();
		    }*/catch (IOException e) {
			      System.out.println("An error occurred. - IO");
			      e.printStackTrace();
			    }
		
	}

}
