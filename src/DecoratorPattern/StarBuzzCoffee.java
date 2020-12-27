package DecoratorPattern;

public class StarBuzzCoffee{
	
	
	public static void main(String[] args) {
		Beverage beverage  = new Espresso();
		System.out.println(beverage.getDescription() + " Cost " + beverage.cost());
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " Cost " + beverage.cost());
		
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " Cost " + beverage.cost());
		
	}
}
