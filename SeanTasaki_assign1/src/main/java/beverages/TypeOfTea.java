package beverages;

import behaviors.BrewBehavior;

public abstract class TypeOfTea implements TypeOfBeverage{
	
	//This abstract class represents the different types of tea beverages. 
	
	//The reference variable for the BrewBehavior interface type. All TypeOfTea subclasses inherit these.
	protected BrewBehavior brewTea;
	protected String name;
	protected int waterTemp;
	protected int milkCondiment = 0;
	protected int sugarCondiment = 0;
	
	public TypeOfTea(int milk, int sugar) {
		this.milkCondiment = milk;
		this.sugarCondiment = sugar;	
	}
	public void setName(String name) {
		this.name = name;	
	}
	
	public void setWaterTemp(int water) {
		this.waterTemp = water;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWaterTemp() {
		return this.waterTemp;
	}
	
	public void setBrewBehavoir(BrewBehavior type) {
		this.brewTea = type;
	}
	
		
}
	


