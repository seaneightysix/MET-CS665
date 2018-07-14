package behaviors;

public class BrewRegularCoffee extends BrewCoffee {
	
	public BrewRegularCoffee() {
		this.setName("Regular Coffee");
		this.setNumOfShots(0);
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
	

