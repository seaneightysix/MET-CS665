package beverages;
import behaviors.BrewBehavior;
import behaviors.BrewEspresso; 
public class Espresso extends TypeOfCoffee {
	
	public Espresso(int milk, int sugar) {
	super(milk, sugar);
	brewCoffee = new BrewEspresso();
	}
	
	public void performBrew() {
		brewCoffee.brew(this.milkCondiment, this.sugarCondiment);
}
}