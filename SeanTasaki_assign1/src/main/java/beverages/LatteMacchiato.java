package beverages;
import behaviors.*;

public class LatteMacchiato extends TypeOfCoffee {
	
	public LatteMacchiato(int milk, int sugar) {
	super(milk, sugar);
	brewCoffee = new BrewLatteMacchiato();	
	}
	
	public void performBrew() {
		brewCoffee.brew(this.milkCondiment, this.sugarCondiment);
	}
}