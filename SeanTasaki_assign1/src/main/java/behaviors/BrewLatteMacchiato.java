package behaviors;

public class BrewLatteMacchiato extends BrewCoffee {
	
	//Latte Macchiato's come with 2 shots of espresso and frothed milk.
	public BrewLatteMacchiato() {
		this.setName("Latte Macchiato");
		this.setNumOfShots(2);
	}
	
	@Override
	public void brew(int milk, int sugar) {
		this.grindCoffee();
		this.addFrothedMilk(typeOfMilk);
		this.addEspressoShot(numOfShots);
		this.addCondiments(milk, sugar);
		System.out.println("Your cup of " + this.getName() + " is ready. Enjoy :)\n");
	}
	
}
