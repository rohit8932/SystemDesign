package DecoratorPattern;

public class Espresso extends Beverage{

	public Espresso() {
		description = "Espresso";
	}
	@Override
	public String getDescription() {
		return description;
	}
	
	
	@Override
	public double cost() {
		return 85;
	}
	
};
