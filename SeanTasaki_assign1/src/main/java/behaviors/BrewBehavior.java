package behaviors;
import beverages.TypeOfBeverage;

//This interface represents the different brewing behaviors

public interface BrewBehavior {	
	
	//setter and getter methods
	public void setWaterTemp(int water);
		
		
	public void setTypeOfMilk(String typeMilk);
	
	public void setAmountOfMilkCondiment(int milk);
	
	public void setAmountOfSugarCondiment(int sugar);
		
	public void setName(String name);
		
	public String getTypeOfMilk();
	
	public int getAmountOfMilkCondiment();
	
	public int getAmountOfSugarCondiment();
		
	public String getName();
		
	//adds hot water
	public void addHotWater(int waterTemp);
	
	//adds condiments
	public void addCondiments(int milk, int sugar);
		
	// A simple brewing method for all types of beverages.
	public void brew(int milk, int sugar);
	
	}


