package behaviors;

import beverages.TypeOfBeverage;

public class BrewTea extends BrewBehaviorAbstractClass {
	
	public BrewTea(String name, int waterTemp) {
		this.name = name;
		this.waterTemp = waterTemp;
	}
	
	public void addTeaBag(String name) {	
		System.out.println(name + " bag added.");
	}
	

	public void brew(int milk, int sugar){
		this.addTeaBag(name);
		this.addHotWater(waterTemp);
		this.addCondiments(milk, sugar);	
		System.out.println("Your cup of " + name + " is ready. Enjoy :)\n");
	}




}