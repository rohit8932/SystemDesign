package DecoratorPattern;

public abstract class Beverage { //this can also be interface
	String description = "Unknown";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
