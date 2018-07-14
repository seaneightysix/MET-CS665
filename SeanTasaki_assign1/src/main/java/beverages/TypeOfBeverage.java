package beverages;

import behaviors.BrewBehavior;

public interface TypeOfBeverage {
	// this interface represents all types of beverages. 
	
	public void performBrew();
	public void setBrewBehavoir(BrewBehavior type);
	
	
}
