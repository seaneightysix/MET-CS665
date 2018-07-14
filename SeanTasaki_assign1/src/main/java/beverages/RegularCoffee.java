package beverages;
import behaviors.*;

public class RegularCoffee extends TypeOfCoffee {
	
	public RegularCoffee(int milk, int sugar) {
	super(milk, sugar);
	brewCoffee = new BrewRegularCoffee();	
	}
	
	public void performBrew() {
		brewCoffee.brew(this.milkCondiment, this.sugarCondiment);
	}
}
