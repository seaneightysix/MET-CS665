package behaviors;

public class BrewEspresso extends BrewCoffee{
	
	//Each espresso comes with 1 shot
	public BrewEspresso() {
		this.setName("Espresso");
		this.setNumOfShots(1);
	}
	
	@Override
	public void brew(int milk, int sugar) {
		this.grindCoffee();
		this.addHotWater(waterTemp);
		this.addEspressoShot(numOfShots);
		this.addCondiments(milk, sugar);
		System.out.println("Your cup of " + this.getName() + " is ready. Enjoy :)\n" );
	}
}
