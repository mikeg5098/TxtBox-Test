package program;

public class Day {
	
	static String name;
	static String place;
	static String month;
	static String day;
	static String year;
	static String description;
	
	
	public static String getName(){return name;}
	
	
	public static void setName(String temp)
	{
		name = temp;
	}
	public static void setPlace(String temp)
	{
		place = temp;
	}
	public static void setDay(String temp)
	{
		day = temp;
	}
	public static void setMonth(String temp)
	{
		month = temp;
	}
	public static void setYear(String temp)
	{
		year = temp;
	}
	public static void setDescription(String temp)
	{
		description = temp + '\n';
	}
	
	public static void saveDay()
	{
		String save = name +'\n'+place+'\n'+month+'\n'+ day +'\n'+year+'\n'+ description+'\n'+-1+'\n'; 
		file.write(save);
	}
	

}
