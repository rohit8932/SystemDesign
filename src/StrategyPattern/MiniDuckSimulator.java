package StrategyPattern;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		mallard.swim();
	}
	

}
