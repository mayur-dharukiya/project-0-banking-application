package sample;

public abstract class Bird {
	
	public abstract void birdSound();
	
	public abstract void birdSound1();
	
	public void sleep()
	{
		
		System.out.println("zzzz");
	}


}

class Parrot extends Bird{

	@Override
	public void birdSound() {
		
		System.out.println("Swhowak");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void birdSound1() {
		// TODO Auto-generated method stub
		
	}
	
	
}

