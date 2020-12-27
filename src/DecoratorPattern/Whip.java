package DecoratorPattern;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage bev) {
		beverage = bev;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return Math.round(beverage.cost() + 12.8);
	}
	
}
