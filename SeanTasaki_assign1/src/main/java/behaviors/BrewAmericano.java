package behaviors;

public class BrewAmericano extends BrewCoffee{
	
	//3 oz of hot water is added for each Americano
	protected int hotWater = 3;
	
	//Each Americano comes with 1 shot
	public BrewAmericano() {
		this.setName("Americano");
		this.setNumOfShots(1);
	}
	
	
	@Override
	public void brew(int milk, int sugar) {
		this.grindCoffee();
		this.addHotWater(waterTemp);
		this.addEspressoShot(numOfShots);
		//Americano comes with 3 oz of hot water added to espresso shot
		this.addAdditionalWater(hotWater);
		this.addCondiments(milk, sugar);			
		System.out.println("Your cup of " + this.getName() + " is ready. Enjoy :)\n" );
	}
}
			
			

