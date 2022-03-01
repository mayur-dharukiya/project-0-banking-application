package sample;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import java.util.logging.Logger;
import java.util.logging.Level;


public class JSONWriting {
	
	public static void main(String[] args)
	{
		
		
		
		
		Logger logger=Logger.getLogger(JSONWriting.class.getName());
		
		
		logger.info("Application successfully started"+logger.getName());
		
		
		logger.warning("Warning");
		
		int[] a= {1,2,3};
		int index=4;
		
		logger.config("Index is set to\t"+index);
		
		try
		{
			
			System.out.println(a[index]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			logger.log(Level.SEVERE, "Very Server Error occured due to unhandled exception for an array");
		}
		
		
		
		JSONParser parser=new JSONParser();
		
		try
		{
			
			
			
			
			Object obj=parser.parse(new FileReader("Country.json"));
			
			JSONObject json=(JSONObject) obj;
			
			String nameOfCountry= (String) json.get("Name");
			System.out.println("Name of Country is\t"+nameOfCountry);
			
			String population=(String) json.get("Population");
			System.out.println("Population is \t"+population);
			
			System.out.println("States are");
			
			JSONArray states= (JSONArray) json.get("States");
			
			Iterator it=states.iterator();
			
			while(it.hasNext())
			{
				
				System.out.println("State Name is\t"+it.next());
				
			}
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		JSONObject countryObj=new JSONObject();
//		
//		countryObj.put("Name","USA");
//		countryObj.put("Population","340000000");
//		
//		JSONArray listOfStates=new JSONArray();
//		listOfStates.add("California");
//		listOfStates.add("Nebraska");
//		
//		countryObj.put("States", listOfStates);
//		
//		try {
//			
//			
//			File file=new File("Country");
//	        file.createNewFile();
//	        
//	        FileWriter writer=new FileWriter(file);
//	        System.out.println(countryObj);
//	        
//	        writer.write(countryObj.toJSONString());
//	        writer.flush();
//	        writer.close();
//		
//			
//			
//		}catch(IOException e)
//		{
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
