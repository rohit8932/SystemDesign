package DecoratorPattern;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage bev) {
		beverage = bev;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+ ", Mocha";
		
	}

	@Override
	public double cost() {
		return beverage.cost() +  23.6;
	}
	

}
