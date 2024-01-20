/* A fancy coffee maker.  Makes coffee of varying strengths. */
/**
 *
 * @author RDCOMP
 */
import java.util.*;
public class CoffeeMachine {

        // The current strength of the coffee.
    private String strength = "Killer Intense";
    private boolean stageAB=false, stageAW=false, stageGB=false;
    private int water = 0;


    /**
     * Set the strength of the Coffee to s; affects the fineness of the
     * grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can
     * try others.
     * @param s Text Description of Strength
     */
    public void setStrength(String s) {
        strength = s;
    }
    
    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {
        if (stageAB){
            System.out.println("Grinding beans for " + strength + " coffee."); 
            stageGB = true;
        }
        else{
            System.out.println("Follow the steps, add beans first!");
        }       
    }
    

    /**
     * Brew the coffee into given cup c
     * @param c The cup of coffee to be filled
     */
    public void brew(CoffeeCup c) {
        if (stageAB && stageAW && stageGB && water>c.getSize()){
            System.out.println("Brewing " + strength + " coffee into cup " + c.getName() + ".");
            c.fill();
        }
        else if (water<c.getSize()){
            System.out.println("There is not enough water in the coffee machine."); 
        }
        else{
           System.out.println("Did you miss any step before you try to brew the coffee?"); 
        }
    }
    

    /**
     * Add water to the machine reservoir
     */
    public void addWater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much water would you like to add?");
        System.out.println("Please enter a number for the amount of water you want to add.");
        System.out.println("The current water level is " + water+".");
        int addW = sc.nextInt();
        water += addW;
        System.out.println("Adding Water");  
        stageAW=true;
    }

    /**
     * Add Beans to the Machine
     */
    public void addBeans() {
        System.out.println("Adding Beans");
        stageAB = true;
    }
        
    public int waterLevelAfterBrew(CoffeeCup c){
        if (c.isFull()){
            if (water-c.getSize()>=0){
                return water-= c.getSize();
            }
            else{
                return water;
            }
        }
        else{
            return water;
        }
    }
    
    public void currentWL(CoffeeCup cp){
        int wL = waterLevelAfterBrew(cp);
        if (wL==0){
            System.out.println("There is no water in the machine.");
        }
        System.out.println("The current water level is "+wL+".");
    }

}
