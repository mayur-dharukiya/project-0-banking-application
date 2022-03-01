package sample;

public class Main {
	
	private String name="Mayur";
	
	//getter
	
	public String getName()
	{
		return name;
		
	}
	
	//setter
	
	public  void setName(String newName) 
	
	{
	
		 
		name=newName;
		
		
		
	}
	
	
	int x;
	
	String s;
	
	public Main()
	{
		
		x=20;  // set the initial value of x to 20
	}
	
	
	
	
   final int audiPrice=100000;
   
   
   static void myStaticMethod()
   {
	   System.out.println("I am inside Static Method");
   }
   
   public int myPublicMethod()
   {
	   
	   System.out.println("I am inside Public Method");
	   
	   return 1;
	   
   }
   
   
  public int myMethod()
   {
	   
	   System.out.println("I am inside Main Class");
	   
	   return 1;
	   
   }
  
  public String Registration(String name,String address)
  {
	  
	String result=name+address;
	
	System.out.println("Result is"+result);
	return result;
	  
	  
  }
   
   
	
	

}
