package sample;


import java.io.*;

import birdview.SingleObject;


public class AnimalMain {
	
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InvalidAgeException
	{
		
		
	   SingleObject object=SingleObject.getInstance();
		
		object.showMessage();
		
		
		int age=10;
		
//		if(age<18)
//		{
//			throw new InvalidAgeException("Not a valid Age,pls enter valid age");
//			
//		}
		
	
		
		
		int[] myNumbers= {1,2,3,4};
		
		
	    	   
				System.out.println("Exception"+myNumbers[3]);
				
				
	 
	    	   System.out.println("something went wrong inside an myNumbers Array");
	    	   
	      
		 
		 
//		 try {
//	    	   
//				System.out.println("Exception"+myNumbers[4]);
//				
//				
//	    	   
//	       }
//	       catch(ArrayIndexOutOfBoundsException e)
//	       {
//	    	   
//	    	   
//	    	   System.out.println("something went wrong inside an myNumbers Array");
//	    	   
//	       }
//		 finally
//		 {
//			 System.out.println("there are no exeptions");
//			 
//			
//		 }
		 
		 
		
		 
	
		
	
		
		
		Animal myAnimal=new Animal(1,"Dog");
		
		try {
			
			FileOutputStream fout=new FileOutputStream("Dog.txt");
			
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(myAnimal);
			
			out.flush();
			
			out.close();
			
			System.out.println("Success");
			
		} catch (IOException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			FileInputStream fis=new FileInputStream("Dog.txt");
			ObjectInputStream in=new ObjectInputStream(fis);
			
			Animal m=(Animal)in.readObject();
			
			System.out.println("ID\t"+m.id+"Name\t"+m.myName);
			
		}
		catch(IOException | ClassNotFoundException e)
		{
			
		}
		
	
		
		myAnimal.checkAge(19);
		
		Animal myPig=new Pig(1,"Hello");
		Animal myDog=new Dog(2,"You there");
		
		myDog.animalSound();
		
//		myPig=null;
//		
//		myPig=myDog;
//		
//		new Pig();
		
//		myAnimal.animalSound();
//		myPig.animalSound();
//		myDog.animalSound();
		
		
		Parrot p=new Parrot();
		
		Bird p1=new Parrot();
		
		p.birdSound();
		
        p.sleep();
        
        Asian a=new Asian();
        
        a.fly();
        a.run();
        a.walk();
        a.sound();
        
        String myStr="Revature";
        
        String yourStr="revature";
        
        char result=myStr.charAt(3);
        
        System.out.println("Result is\t"+result);
        
       boolean b= myStr.equals(yourStr);
       
       boolean b1=myStr.equalsIgnoreCase(yourStr);
       
       System.out.println(b);
       
       System.out.println("B1"+b1);
       
       Integer i=5;
       
       String s1=i.toString();
       
       System.out.println("Length of a string is "+myStr.length());
       
      String z1= myStr.trim();
       
       System.out.println("Trimmed String "+z1.length());
       
       System.out.println("Starts With "+myStr.startsWith("Rev"));
       
       System.out.println("Starts With another one "+myStr.startsWith("zyk"));
       
       
      
       
       
       
       
       
       
       
       
        
        
        
		
	}

}
