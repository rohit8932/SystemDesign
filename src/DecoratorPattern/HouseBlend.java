package DecoratorPattern;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "House Blend";
	}
		
	public String getDescription() {
		return description;
	}
	
	@Override
	public double cost() {
		return 75;
	}
}
