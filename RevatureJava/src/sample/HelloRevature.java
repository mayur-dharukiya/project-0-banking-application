package sample;


import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

import java.io.*;


import birdview.BirdViewClass;
import birdview.*;


public class HelloRevature {
	
	
	static int r=200;
	
	//Methods
	
    static int myMethod(String fname, String lName, int address)
	{
		System.out.println("First Name\n"+fname+"Last Name\n"+lName+"Address\n"+address);
		return 1;
	}
    
  
    static int summation(int i,int j)
    {
    	
    	int k=i+j+r;
    	
    	return k;
    }
    
    static int summation(String i,int j,int l)
    {
    	
    	int k=j+l;
    	
    	return k;
    }
    
  
    
    
	
	public static void main(String args[]) throws IOException
	{
		
		
		String tempArray[]= new String[100];
		
		 for( int i=0; i<args.length; i++ ) {
	            
	          
	          System.out.println("Inputs to the methods are "+args[i]);
	          
             tempArray[i]=args[i];
            System.out.println("Tem Array"+tempArray[i]);
	           
	  
	        }
		 
		     Main r=new Main();
		     
		    
		 
		     r.Registration(tempArray[0], tempArray[1]);
//		 
//		
//		 
//
//		 
//		
//		
//		BirdViewClass b=new BirdViewClass();
//		
//		b.settings();
//		
//		
//		 
//		String m1= r.getName();
//		System.out.println("Old Value"+m1);
//		
//		//m1=Mayur
//		
//		if(m1!="Alec")
//		{
//			
//			r.setName("Alec");
//			
//			System.out.println("New Value"+r.getName());
//		}
//		else
//		{
//			
//		}
//		
	
		
		
		 
		 
	
		
		// Enter data using BufferReader 
        BufferedReader reader = new BufferedReader( 
            new InputStreamReader(System.in)); 
        
        System.out.println("Enter the input");
  
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name); 
        
        System.out.println("Enter the 2nd input");
        
        String name1 = reader.readLine(); 
        
        // Printing the read line 
        System.out.println(name1); 
        
		
//		Scanner in = new Scanner(System.in); 
//		  
//        String s = in.nextLine(); 
//        System.out.println("You entered string " + s); 
//  
//        int a = in.nextInt(); 
//        System.out.println("You entered integer " + a); 
//  
//        float b = in.nextFloat(); 
//        System.out.println("You entered float " + b); 
	        
	        
//		System.out.println("Hello World");
//		
//		Main.myStaticMethod();
//		
//		
//        Main x=new Main();
        
      //  System.out.println("Value of X\t"+x.x+"Value of Y\t"+x.y+"Value of S\t"+x.s+"Value of S2\t"+x.s2);
        
        
		
//		x.myPublicMethod();
//		
//		
//		HelloRevature myObj1=new HelloRevature();// obj 1
//		
//		HelloRevature myObj2=new HelloRevature();
		
		

		
		
		Main anotherObj1=new Main();
		
		Main anotherObj2=new Main();
		
		anotherObj2.x=20;
		
		int n=anotherObj1.myMethod();
		
		System.out.println("Value of N is "+n);
		
		
		int m=n+anotherObj2.x;
		
		
		//anotherObj.audiPrice=200000;
		
		
		//System.out.println("Audi Price"+anotherObj.audiPrice);
		
		System.out.println("Audi Price"+anotherObj1.x);
		System.out.println("Audi Price"+anotherObj2.x);
		


		
//		System.out.println(myObj1);
//		
//		System.out.println(myObj2);
		
		
		
		
		
		
		int t=100;
		
		
		System.out.print(t);
		
		myMethod("Mayur","D",1);
		myMethod("Hunter","T",2);
		myMethod("Alec","A",3);
		
	int z1=summation(4,5);
	
	int z2=summation("Mayur",5,6);
	
	
	
	System.out.println("Value of Summation"+z1);
		
		
		
		
		int day=4;
		
		switch(day)
		{
		
		case 6:
			
			System.out.println("Hello World");
			break;
			
		case 7:
			
			System.out.println("Hello World");
			break;
			
			
		default:
			System.out.println("Did not match");
			
		}
		
		int i=0;
		
		while(i<5)
		{
			
			System.out.println("Value of I is"+i);
			i++;
			//i=i+1;  1
		}
		
		int j=0;
		do {
			
			System.out.println("Value of J is"+j);
			j++;
			
		}
		while(j<5);
		
		
	
	
	//java for Loop
	
//	for(statement 1; statemetn 2 ; statement 3)
//	{
//		
//		
//		
//	}
	
	for(int k=0; k<29; k=k+5)
	{
		
		System.out.println("Value of K is"+k);
		
		if(k==15)
			continue;
	}
	
	
	//Java Arrays
	
		String[] cars = {"Volvo","BMW","Ford","Merc"};
		
		int[] myNum = {10,20,30,40};
		
		
		System.out.println(cars[0]);
		
		System.out.println(cars[1]);
		
		cars[0]="Mahindra";
		
		System.out.println(cars[0]);
		
		System.out.println("Length of an array is "+cars.length);
		
		
		for(int z=0; z<cars.length;z++)
		{
			System.out.println(cars[z]);
		}
		
		for(String y:cars)
		{
			
			System.out.println(y);
		}
		
		//multi-dimensional array
		
		
		int[][] myNumbers= { {1,2,3}, {5,6,7}};
		
		int x5= myNumbers[1][2];
		
		System.out.println(x5);
		
		for(int o=0;o<myNumbers.length;++o)
		{
			
			for(int u=0;u<myNumbers[o].length;++u)
			{
				
				System.out.println(myNumbers[o][u]);
			}
		}
		
		//1,2,3,5,6,7
		
		
		
	
	
	}
	
	
	
	
	
	


}








