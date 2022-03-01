package sample;

public class Vehicle {
	
	protected String brand="Ford";
	
	public void honk() {
		
		System.out.println("Tutt,Tutt");
	}
	
	void run()
	{
		System.out.println("Running in parent class");
	}

}



class Car extends Vehicle{

@Override	
void run()
{
	
	System.out.println("Running in Car class");
	System.out.println("Running in Car class");
}
	
	
private String modelName="Mustang";


public static void main(String[] args)
{
	
	Car myCar=new Car();
	
	myCar.honk();
	
	
	System.out.println("Brand Name"+myCar.brand+"Model Name"+myCar.modelName);
	
	myCar.run();
	
	
}








	
}
