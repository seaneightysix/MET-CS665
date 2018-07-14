import beverages.*;
import java.util.*;
import java.lang.*;

public class Main {


	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			int beverage = 0;		
			Scanner keyboard = null;	

			keyboard = new Scanner(System.in);		
			System.out.println("Hello! Please select a beverage from the following menu:");

			while(true) {
				try {
					System.out.println("1: Regular Coffee \n2: Espresso \n3: Americano \n4: Latte Macchiato \n5: Green Tea \n6: Black Tea \n7: Yellow Tea \n8: Exit");
					beverage = keyboard.nextInt();	
					if (!(beverage>= 1 & beverage <= 8)) 
						throw new Exception();
					else
						break;
				}
				catch(Exception e){
					if (e instanceof InputMismatchException) {
						keyboard.next();
						System.out.print("Not a valid entry. Try again: \n");
					}
					else
						System.out.print("Not a valid entry. Try again: \n");
				}

			}

			if (beverage == 8){
				System.out.println("Exit...Have a nice day");
				keyboard.close();
				run = false;
				System.exit(0);

			}

			int sugar;
			int milk;
			System.out.println("Would you like any milk?");
			while (true) {
				try {
					System.out.println("0: None \n1: 1 teaspoon \n2: 2 teaspoons \n3: 3 teaspoons");
					milk = keyboard.nextInt();
					if (!(milk>= 0 & milk <= 3)) {
						throw new Exception();							
					}
					else
						break;
				}
				catch(Exception e) {
					if (e instanceof InputMismatchException) {
						keyboard.next();
						System.out.print("Not a valid entry. Try again: \n");
					}
					else
						System.out.print("Not a valid entry. Try again: \n");				
				}
			}
			if (milk > 0)
				System.out.println(milk + " teaspoon(s) of milk selected.\n");

			System.out.println("Would you like any sugar?");
			while (true) {
				try {
					System.out.println("0: None \n1: 1 teaspoon \n2: 2 teaspoons \n3: 3 teaspoons");
					sugar = keyboard.nextInt();
					if (!(sugar>= 0 & sugar <= 3)) {
						throw new Exception();							
					}
					else
						break;
				}
				catch(Exception e) {
					if (e instanceof InputMismatchException) {
						keyboard.next();
						System.out.print("Not a valid entry. Try again: \n");
					}
					else
						System.out.print("Not a valid entry. Try again: \n");				
				}
			}
			if (sugar > 0)
				System.out.println(sugar + " teaspoon(s) of sugar selected.\n");

			switch (beverage) {
			case 1:
				System.out.println("Regular cup of coffee");
				TypeOfCoffee regularCoffee = new RegularCoffee(milk, sugar);
				regularCoffee.performBrew();
				break;
			case 2:
				System.out.println("Cup of Espresso");
				TypeOfCoffee espresso = new Espresso(milk, sugar);
				espresso.performBrew();		
				break;
			case 3:
				System.out.println("Cup of Americano");
				TypeOfCoffee americano = new Americano(milk, sugar);
				americano.performBrew();
				break;			
			case 4:
				System.out.println("Cup of Latte Macchiato");
				TypeOfCoffee latteMacchiato = new LatteMacchiato(milk, sugar);
				latteMacchiato.performBrew();
				break;
			case 5:
				System.out.println("Cup of Green Tea");
				TypeOfTea greenTea = new GreenTea(milk, sugar);
				greenTea.performBrew();
				break;
			case 6:
				System.out.println("Cup of Black Tea");
				TypeOfTea blackTea = new BlackTea(milk, sugar);
				blackTea.performBrew();
				break;
			case 7:
				System.out.println("Cup of Yellow Tea");
				TypeOfTea yellowTea = new YellowTea(milk, sugar);
				yellowTea.performBrew();
				break;		
			}					
		}
	}
		
}


