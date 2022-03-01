package birdview;

public class SingleObject {
	
	
	//create an object of SignleObject Class
	private static SingleObject instance=new SingleObject();
	
	//makes the constructor private so that this class can not be instatiated
     private SingleObject()
	{
		
	}
	
	//get the object which is already available
	public static SingleObject getInstance()
	{
		
		return instance;
	}
	
	
	
	public void showMessage() {
		
		System.out.println("Hellow Singleton Class");
	}
	

}
