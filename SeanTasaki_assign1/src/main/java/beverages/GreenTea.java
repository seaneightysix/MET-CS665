package beverages;

import behaviors.*;

public class GreenTea extends TypeOfTea{	
	
	//Green Tea brewed at 175 degrees.
	
	public GreenTea(int milk, int sugar) {
		super(milk, sugar);
		this.setName("Green Tea");
		this.setWaterTemp(175);
		brewTea = new BrewTea(name, waterTemp);	
		}
		
		public void performBrew() {
			brewTea.brew(this.milkCondiment, this.sugarCondiment);
		}
}

