package StrategyPattern;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override 
	public void display() {
		System.out.println("I'm real Mallard duck!!");
		
	}
	
	
	
}
