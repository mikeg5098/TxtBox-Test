package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;




public class file {
	
	
	public static class DayOBJ
	{
		public String name;
		public String place;
		public String month;
		public String day;
		public String year;
		public String description;
		
		
		public DayOBJ(String t1, String t2, String t3, String t4, String t5, String t6)
		{
			name = t1;
			place = t2;
			month = t3;
			day = t4;
			year = t5;
			description = t6;
			
		}
		
		public String getName()
		{
			return name;
		}
		
		
		
	}
	
	public static DayOBJ[] arr;
	
	
	public static int counter()
	{
		int count = 0;
		
		File file = new File("/Users/user/Desktop/dates.txt");
		try {
	        BufferedReader reader = new BufferedReader(new FileReader(file));
	        String line = null;
	        while ((line = reader.readLine()) !=null) {
	            for(int i=0; i<line.length();i++){
	                if(line.charAt(i) == '-'){
	                    count++;
	                }
	            }
	        }
	    } catch (FileNotFoundException e) {
	        // File not found
	    } catch (IOException e) {
	        // Couldn't read the file
	    }
		return count;
		
	}
	
	public static void read(){
		
		
		int size = file.counter();
		
		File file = new File("/Users/user/Desktop/dates.txt");
		
		arr = new DayOBJ[size];
		
		int iterator = 0;
		try
		{
			Scanner sc = new Scanner(file);

			
			
	        while (sc.hasNext())
			{
					String tName = sc.nextLine(); 
					String tPlace = sc.nextLine(); 
					String tMonth = sc.nextLine(); 
					String tDay = sc.nextLine(); 
					String tYear = sc.nextLine(); 
					
					String d = "";
					String line = sc.nextLine();
					
					while(line != "-1") {
						d += line;
						
						if(sc.hasNextLine()) {
							line = sc.nextLine();
						}
						else {
							break;
						}
					}
					
					//arr[iterator] = new DayOBJ(tName, tPlace, tMonth, tDay, tYear, d);
					
					
					//iterator++;
					//System.out.print(iterator);
					System.out.println(tName+'\n');
					
					
			}
			
			
			sc.close();
			
			//String temp = arr[1].getName();
			//String temp4 = arr[4].getName();
			
			//System.out.println(temp);
			
			

			
			
			
			
			
			
			
			
			
			/*
			while(!stack.empty())
			{
				for(int i = 0; i<size;i++)
				{
					arr[i] = stack.pop();
				}
			}
			
			for(int i = 0; i<(size-1);i++)
			{
				System.out.println(arr[i].getName());
			}
			*/
				
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

