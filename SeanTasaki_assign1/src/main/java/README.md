Assignment 1: Fully Automatic Beverage Vending Machine

**TypeOfBeverage** can be:  

+ **Cofee** like Regular Coffee, Americano, Espresso, and Latte Macchiato
+ **Tea** like Green Tea, Black Tea, and Yellow Tea


These types of beverages have different brew behaviors.

**BrewBehavior** can be:
+ **BrewCoffee** like brew regular coffee, brew americano, brew espresso, and brew latte macchiato.
+ **BrewTea** that brews any tea beverage.

Teas are brewed at different temperatures, depending on the tea type. All coffees are brewed at the same temperature.
The int waterTemp is set in the constructor for BrewCoffee and for BrewTea. 


Flexibility:
My program demonstrates flexibility. Different teas or coffee drinks can be added in the future by creating a subclass of TypeOfCoffee or TypeOfTea in the beverages package, and by creating a subclass of BrewCoffee (if a coffee beverage) in the behaviors package. Also, another category of beverages could be added (such as juice) by creating a TypeOfJuice class and subclassing that with concrete juice classes.

Low Coupling:
My program is loosely coupled. Brew behaviors can be modified without touching any of the beverages that use the brew behaviors. 

Strategy Design Pattern:
I have implemented the strategy design pattern. For this use case, there are concrete objects such as different types of beverages that require different behaviors. By following the design principle "favor composition over inheritance," I created a HAS-A relationship: each beverage has a BrewBehavior to which it delegates how it gets brewed. This is the meaning of composition. 

No Duplicated Code:
There is no duplicated code. 

# How to compile the project

Use Apache Maven to compile and run this project

```bash
mvn clean compile
```

# How to create a binary runable package 


```bash
mvn clean compile assembly:single
```



or 


```bash
mvn clean package
```



# How to run


```bash
java -cp target/*.jar Main

```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```
