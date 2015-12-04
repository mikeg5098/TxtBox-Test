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
		public String getPlace()
		{
			return place;
		}
		
		
		
	}
	
	public static DayOBJ[] arr;
	
	
	public static int counter()
	{
		int count = 0;
		
		File file = new File("/Users/Owner/Desktop/TxtBox Test/dates");
		try {
	        BufferedReader reader = new BufferedReader(new FileReader(file));
	        String line = null;
	        while ((line = reader.readLine()) !=null) 
	        {
	            for(int i=0; i<line.length();i++)
	            {
	                if(line.charAt(i) == '-')
	                {
	                    count++;
	                }
	            }
	        }
	        reader.close();
	    } catch (FileNotFoundException e) 
		{
	        // File not found
	    } catch (IOException e) 
		{
	        // Couldn't read the file
	    }

		return count;
		
	}
	
	public static void read(){
		
		
		int size = file.counter();
		
		File file = new File("/Users/Owner/Desktop/TxtBox Test/dates");
		
		arr = new DayOBJ[size];
		
		int iterator = 0;
		try
		{
			Scanner sc = new Scanner(file);

			
			
	        while (sc.hasNextLine())
			{
					String tName = sc.nextLine(); 
					String tPlace = sc.nextLine(); 
					String tMonth = sc.nextLine(); 
					String tDay = sc.nextLine(); 
					String tYear = sc.nextLine(); 
					
					String d = "";
					Boolean check = true;
					
					String line = sc.nextLine();
					//issue here
					do
					{
						d += line;
						
						if(sc.hasNextLine() && line != "-1" ) 
						{
							line = sc.nextLine();
						}
						else
						{
							break;
						}
						if(sc.nextLine() == "-1")
						{
							check = false;
						}
					}while(line != "-1" && check == true);
					//issue between here
					
					arr[iterator] = new DayOBJ(tName, tPlace, tMonth, tDay, tYear, d);
					
					
					iterator++;
					//System.out.print(iterator);
					System.out.println(tName + '\n');
					System.out.println(tPlace + '\n');
					System.out.println(d + '\n');
			}
	        System.out.print(arr[0].getName());
			
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
		try(PrintWriter output = new PrintWriter(new FileWriter("/Users/Owner/Desktop/TxtBox Test/dates",true))) 
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

