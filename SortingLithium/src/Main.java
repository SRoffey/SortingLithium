/**
 * The main method for this program.
 * This was only used to test each class works.
 */
public class Main {

    public static void main(String[] args) {
        //GenerateLithium
        GenerateLithium test = new GenerateLithium();
        test.generateSample();
        test.printTray();
        //LithiumGrading
        LithiumGrading grade = new LithiumGrading();
        grade.generateGrades();
        grade.sortingLithium();
        //LithiumPricing
        LithiumPricing prices = new LithiumPricing();
        prices.setPrice();
        prices.printPrices();
        //BuyLithium
        BuyLithium buy = new BuyLithium();
        buy.findBestPrice(900.00);
        buy.findHighQuality(20);
    }
}

