package sample;

import java.io.Serializable;

public class Animal implements Serializable {
	
	  public int id=1;
	
	  public String myName="BullDog";
	
	public Animal(int id,String name)
	{
		
		this.id=id;
		this.myName=name;
		
	}
	
	
	public void animalSound()
	{
		
		System.out.println("Animal Makes sound");
	}
	
	public void checkAge(int age)
	{
		
		if(age<18) {
			
			
			throw new ArithmeticException("Access denied");
		}
		
		else
		{
			System.out.println("Access granted");
		}
			
	}
	

}

class Pig extends Animal{
	
	public Pig(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void animalSound()
	{
		super.animalSound();//it will call super class method
		
		System.out.println("Pig Says: Wee Wee");
	}
	
	
}

class Dog extends Animal{
	
	
	public Dog(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void animalSound()
	{
		
		System.out.println("Dog Says:bow bow");
	}
	
}
