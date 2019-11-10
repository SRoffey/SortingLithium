import java.util.*;

/**
 * Lithium pieces are assigned a price based on
 * the quality of each individual piece.
 * Author: Samuel Roffey
 * Date: 15.10.2019
 */
public class LithiumPricing {
    //the HashMap prices stores Integer and Double items.
    HashMap<Integer, Double> prices;
    //sample calls the GenerateLithium Class.
    GenerateLithium sample  = new GenerateLithium();

    /**
     * The constructor of LithiumPricing
     */
    public LithiumPricing() {
        prices = new HashMap<>();
    }

    /**
     * Assigns a price to each different int value in sample.tray
     */
    public void setPrice() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                if(sample.tray[i][j] > 1 && sample.tray[i][j] <= 9) {
                    prices.put(sample.tray[i][j], 300.00);
                } else if (sample.tray[i][j]<= 19) {
                    prices.put(sample.tray[i][j], 600.00);
                } else if(sample.tray[i][j] <= 29) {
                    prices.put(sample.tray[i][j], 900.00);
                } else {
                    prices.put(sample.tray[i][j], 1250.00);
                }
            }
        }
    }

    /**
     * Prints out each key and price from the HashMap prices.
     */
    public void printPrices() {
        for(Integer i : prices.keySet()) {
            String key = i.toString();
            Double value = prices.get(i);
            System.out.println();
            System.out.println(key + "  " + value);
        }
    }

    /**
     * returns the HashMap for BuyLithium class.
     * @return return the HashMap prices
     */
    public HashMap<Integer, Double> getPrices() {
        return prices;
    }
}
