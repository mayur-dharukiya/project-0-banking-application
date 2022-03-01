package sample;



interface Human {
	
	public void walk();
	public void run();
	

}

interface Animal1
{
	
	public void walk();
	public void run();
	
	public void sound();
	public void fly();
}

class Asian implements Human,Animal1
{

	@Override
	public void walk() {
		
		
		System.out.println("Walking");
	}

	@Override
	public void run() {
		
		
		System.out.println("Running");
		
	}

	@Override
	public void sound() {
		
		System.out.println("Sound");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		
		System.out.println("Flying");
		// TODO Auto-generated method stub
		
	}
	
	
}
