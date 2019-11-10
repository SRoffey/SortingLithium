import java.util.*;

/**
 * Prints out the best priced lithium based on the user input.
 * Prints out the best quality lithium based on the user input.
 * Author: Samuel Roffey
 * Date: 21.10.2019
 */
public class BuyLithium {
    //pricing calls the LithiumPricing class.
    LithiumPricing pricing = new LithiumPricing();
    //Assigns an empty HashMap prices which stores Integer and Double values.
    HashMap<Integer, Double> prices;

    /**
     * The constructor of BuyLithium.
     */
    public BuyLithium() {
        pricing.setPrice();
        prices = pricing.getPrices();
    }

    /**
     * Prints out the best priced Lithium less than the input.
     * @param price takes price and compares to other Double values of prices.
     */
    public void findBestPrice(double price) {
        System.out.println("Available Lithium");
        int total = 0;
        for(HashMap.Entry<Integer, Double> entry : prices.entrySet()) {
            if(entry.getValue() <= price) {
                System.out.println(entry.getKey() + "   " + entry.getValue());
                total++;
            }
        }
        if(total > 0) {
            System.out.println("There are " + total + " choices available.");
        } else {
            System.out.println("You cannot have a choice less than 0.00");
        }
    }

    /**
     * Prints out the best quality lithium greater than the input.
     * @param range compares input to key of prices.
     */
    public void findHighQuality(int range) {
        System.out.println("Highest Quality Available: ");
        int total = 0;
        for(HashMap.Entry<Integer, Double> entry : prices.entrySet()) {
            if(range > 50) {
                System.out.println("Lithium grades cannot be higher than 50");
            }
            if(entry.getKey() >= range) {
                total++;
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        if(total > 0) {
            System.out.println("There are " + total + " grades available.");
        } else {
            System.out.println("There are no grades available.");
        }
    }
}
