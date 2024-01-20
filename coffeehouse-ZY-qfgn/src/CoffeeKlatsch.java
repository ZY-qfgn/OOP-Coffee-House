import java.util.*;
public class CoffeeKlatsch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare a reference to a CoffeeMachine.
        CoffeeMachine cm;
        // Create a new CoffeeMachine and make the variable refer to it.
        cm = new CoffeeMachine();
        // Add water and beans to the CoffeeMachine.
        cm.addWater();
        cm.addBeans();  
        // Get ready to grind some strong coffee in the CoffeeMachine.
        System.out.println("Please select the strength of coffee you want: Weak, Regular, Strong, Sweet");
        //String coffeeStrength = sc.next();
	cm.setStrength(sc.next());
        // Grind the beans.
        cm.grindBeans();
        // Declare a reference to a CoffeeCup.
        CoffeeCup cp;
        // Create a new CoffeeCup and make the variable refer to it.
        cp = new CoffeeCup("Alice");
        // Have your CoffeeMachine brew coffee into the coffee cup.
        cm.brew(cp);
        cm.currentWL(cp);
        // Drink from the cup.
        cp.drink(cm);
        // Try to drink again --the cup is now empty.
        cp.drink(cm);
        // Declare ANOTHER coffee cup reference and initialize it.
	CoffeeCup cp2 = new CoffeeCup("Ben");	
        // Brew coffee into the new cup.
        cm.brew(cp2);
        cm.currentWL(cp2);
        // Try to drink from the first cup --it's still empty!
        cp.drink(cm);
        // Drink from the second cup.
        cp2.drink(cm);
        // Print a sigh of satisfaction.
	System.out.println("Cozzy~");
        
        //below is testing code
         //CoffeeMachine cm2 = new CoffeeMachine();
        CoffeeCup cp3 = new CoffeeCup("Cindy");
        cm.grindBeans();
        cm.addWater();
        cm.brew(cp3);
        String names = cp3.getName();
        System.out.println(names);
        cp3.drink(cm);
        cm.currentWL(cp3);
    }
}
