package beverages;

import behaviors.BrewTea;

public class YellowTea extends TypeOfTea {
	
	//Yellow Tea brewed at 170 degrees.
	
	public YellowTea(int milk, int sugar) {
		super(milk, sugar);
		this.setName("Yellow Tea");
		this.setWaterTemp(170);
		brewTea = new BrewTea(name, waterTemp);	
	}
				
	public void performBrew() {
		brewTea.brew(this.milkCondiment, this.sugarCondiment);
	}
}
