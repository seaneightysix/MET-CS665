package beverages;
import behaviors.*;

public class Americano extends TypeOfCoffee {

	public Americano(int milk, int sugar) {
		super(milk, sugar);
		brewCoffee = new BrewAmericano();	
		}
		
		public void performBrew() {
			brewCoffee.brew(this.milkCondiment, this.sugarCondiment);
		}
	}