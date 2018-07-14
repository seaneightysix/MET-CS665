package beverages;
import behaviors.*;

public abstract class TypeOfCoffee implements TypeOfBeverage {
	
	//This abstract class represents the different types of coffee beverages. 
	
	//The reference variable for the BrewBehavior interface type. All TypeOfCoffee subclasses inherit these.
	protected BrewBehavior brewCoffee;
	
	protected String name;
	protected int milkCondiment = 0;
	protected int sugarCondiment = 0;
	
	public void  setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBrewBehavoir(BrewBehavior type) {
		this.brewCoffee = type;
	}

	public TypeOfCoffee(int milk, int sugar) {
		this.milkCondiment = milk;
		this.sugarCondiment = sugar;
		
	}
	
}
