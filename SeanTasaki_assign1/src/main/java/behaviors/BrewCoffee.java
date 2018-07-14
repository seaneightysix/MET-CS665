package behaviors;

public abstract class BrewCoffee extends BrewBehaviorAbstractClass {
	
	//All coffee brewed at water temperature of 205 degrees.
	public BrewCoffee() {
	waterTemp = 205;
	}
	
	//Number of espresso shots
	protected int numOfShots;
	
	//Amount of additonal water added for Americano.
	protected int amountWater;
	
	public void setNumOfShots(int shots) {
		this.numOfShots = shots;
	}
	
	public int getNumOfShots() {
		return this.numOfShots;
	}
	
	public void addEspressoShot(int numOfShots) {
		if (numOfShots > 0)
			System.out.println("Added " + numOfShots + " shot(s) of espresso.");
	}
	
	//Frothed Milk for latte style coffee drinks
	public void addFrothedMilk(String typeOfMilk) {
		System.out.println("Added frothed " + typeOfMilk + ".");		
	}
	
	//Adds additional hot water to espresso shot to make an Americano or any coffee drink that may require it in the future.
	public void addAdditionalWater(int amount) {
		this.amountWater = amount;
		System.out.println("Added " + this.amountWater + " oz of hot water.");
	}
	
	
	public void grindCoffee() {
		System.out.println("Coffee beans grounded up.");
	}
	
	public void brew(int milk, int sugar){
		this.addHotWater(waterTemp);
		this.addCondiments(milk, sugar);
}
}


