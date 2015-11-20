package program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;



public class file {
	
	public void read() {
		
		File file = new File("/Users/user/Desktop/dates.txt");
		
		try
		{
			Scanner sc = new Scanner(file);
			
			
			sc.close();
				
		}
		 catch(FileNotFoundException e){
	    	   System.out.println("Error" + e.getMessage()); 
	    	   e.printStackTrace();
	    }
		
		
	}
	
	public static void write(String day)
	{
		try(PrintWriter output = new PrintWriter(new FileWriter("/Users/user/Desktop/dates.txt",true))) 
		{
		    //output.printf(day);
		    //output.close();
		    BufferedWriter bw = new BufferedWriter(output);
		    bw.write(day);
		    bw.close();
		} 
		catch (Exception e) {}
		
	}
	
      

}

