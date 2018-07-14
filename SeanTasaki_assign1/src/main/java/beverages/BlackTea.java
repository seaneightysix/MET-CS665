package beverages;
import behaviors.*;

public class BlackTea extends TypeOfTea {
	
	//Black Tea brewed at 200 degrees.
	
	public BlackTea(int milk, int sugar) {
		super(milk, sugar);
		this.setName("Black Tea");
		this.setWaterTemp(200);
		brewTea = new BrewTea(name, waterTemp);	
	}
			
	public void performBrew() {
		brewTea.brew(this.milkCondiment, this.sugarCondiment);
		}
}



