package behaviors;
import beverages.TypeOfBeverage;

public abstract class BrewBehaviorAbstractClass implements BrewBehavior {
	protected int waterTemp;
	protected String name;
	
	//Default milk added to beverages is 2% Milk
	protected String typeOfMilk = "2% Milk";
		
	//Milk and Sugar condiments set to 0
	protected int milkCondiment = 0;
	protected int sugarCondiment = 0;	
	
	
	//setter and getter methods
	public void setWaterTemp(int water) {
		this.waterTemp = water;
	}
	public void setTypeOfMilk(String typeMilk) {
		this.typeOfMilk = typeMilk;
	}
	
	public void setAmountOfMilkCondiment(int milk) {		
		this.milkCondiment = milk;		
	}
	
	public void setAmountOfSugarCondiment(int sugar) {
		this.sugarCondiment = sugar;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWaterTemp() {
		return this.waterTemp;
	}
	
	public String getTypeOfMilk() {
		return this.typeOfMilk;
	}
	
	
	public void addHotWater(int waterTemp) {
		System.out.println(waterTemp + " degree hot water added-- brew process completed.");
	}
	
	public int getAmountOfMilkCondiment() {
		return this.milkCondiment;
	}
	
	public int getAmountOfSugarCondiment() {
		return this.sugarCondiment;
	}
	public String getName() {
		return this.name;
	}
	
	public void addCondiments(int milk, int sugar) {
		this.milkCondiment = milk;
		this.sugarCondiment = sugar;
		if (milk == 1)
			System.out.print("Added 1 teaspoon of milk.");
		else if (milk > 1)
			System.out.print("Added " + milk + " teaspoons of milk.");
		if (sugar == 1)
			System.out.println(" Added 1 teaspoon of sugar.");
		else if (sugar > 1)
			System.out.println(" Added " + sugar + " teaspoons of sugar.");			
	}
		
	
	public void brew(int milk, int sugar){
		this.addHotWater(waterTemp);
		this.addCondiments(milk, sugar);
	}
	
}
