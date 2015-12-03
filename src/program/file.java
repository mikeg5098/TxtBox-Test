package program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;




public class file {
	
	private static Day[] arr;
	
	
	public static void read() {
		
		File file = new File("/Users/user/Desktop/dates.txt");
		
		try
		{
			Scanner sc = new Scanner(file);
			
			Stack<Day> stack = new Stack<Day>();
			
			while(sc.hasNextLine())
			{
				    Day temp = new Day();
					temp.setName(sc.nextLine());
					
					//System.out.println(sc.nextLine());
					
					temp.setPlace(sc.nextLine());
					temp.setMonth(sc.nextLine());
					temp.setDay(sc.nextLine());
					temp.setYear(sc.nextLine());
					
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
					
					temp.setDescription(d);
					stack.push(temp);
			}
			sc.close();
			int size = stack.size();
			
			System.out.print(size);
			
			String tempName = stack.pop().getName();
			
			System.out.println(tempName);
			
			arr = new Day[size];
			
			while(!stack.empty())
			{
				for(int i = 0; i<(size-1);i++)
				{
					arr[i] = stack.pop();
				}
			}
			
			for(int i = 0; i<size;i++)
			{
				System.out.println(arr[i].getName());
			}
				
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

