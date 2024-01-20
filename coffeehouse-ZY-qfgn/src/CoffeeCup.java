import java.util.*;
/**
 * A coffee cup
 * In part 2, additional information will be added to this cup
 * @author RD
 */
public class CoffeeCup {
    Scanner sc = new Scanner(System.in);
    private boolean isFull;  // Is this cup full?  Default value false.
    private String name;
    private int size;
    
    public CoffeeCup(String newName){
        name = newName;
        cupSize();
    }
    
    public void cupSize(){
        System.out.println("Please choose a cup size for "+name+": Enter 1 for smallL, 2 for medium, 3 for large.");
        size = sc.nextInt();
    }
    
    public int getSize(){
         return size;
    }
    
    public String getName (){
        return name;
    }
    /**
     * Returns whether this cup is full (true) or empty(false);
     * @return is this cup full?
     */
    public boolean isFull() {
        return isFull;
    }
    
    /**
     * Fill this cup to the top
     */
    public void fill() {
        isFull = true;
    }
    
    /**
     * Drink this cup entirely
     */
    public boolean drink(CoffeeMachine cm) {
            if (isFull){
                System.out.println("You glug the coffee in the cup " + name + " down.");
                isFull = false;
                return true;
            }
            else{
                System.out.println("You sip furiously, but only suck air in the cup " + name + ".");
                return false;
            }
    }
    
}

