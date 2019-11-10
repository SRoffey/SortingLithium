import java.util.*;

/**
 * Takes a tray of lithium and grades the quality of each piece.
 * Also sorts the data into ordered Arrays.
 * Author: Samuel Roffey
 * Date: 07.10.2019
 */
public class LithiumGrading {
    //sample calls the GenerateLithium class.
    GenerateLithium sample = new GenerateLithium();
    //ArrayList Integer lowGrade will store Integer values less than 25
    ArrayList<Integer> lowGrade;
    //ArrayList Integer highGrade will store Integer values greater or equal than 25.
    ArrayList<Integer> highGrade;
    /**
     * The constructor of LithiumGrading
     */
    public LithiumGrading() {
        sample.generateSample();
        lowGrade = new ArrayList<>();
        highGrade = new ArrayList<>();
    }
    /**
     * Sorts data from the generated array into two ArrayLists.
     * If value is greater than 25 it is added to ArrayList highGrade,
     * anything lower is added to ArrayList lowGrade.
     */
    public void generateGrades() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                if(sample.tray[i][j] >= 25 ) {
                    highGrade.add(sample.tray[i][j]);
                } else {
                    lowGrade.add(sample.tray[i][j]);
                }
            }
        }
    }
    /**
     * Takes the two ArrayLists and converts each of them back into Arrays.
     * The newly created Arrays are then each sorted with a Bubble Sort.
     * Once sorted the Arrays are printed out.
     */
    public void sortingLithium() {
        //lowGrade sort
        //Array convertLo stores the values of ArrayList lowGrade;
        Integer[] convertLo = lowGrade.toArray(new Integer[lowGrade.size()]);
        int loSize = convertLo.length;
        for(int i = 0; i < loSize - 1; i++) {
            for(int j = 0; j < loSize - i - 1; j++) {
                if(convertLo[j] > convertLo[j+1]) {
                    int temp = convertLo[j];
                    convertLo[j] = convertLo[j+1];
                    convertLo[j+1] = temp;
                }
            }
        }
        //highGrade Sort
        //Array convertHi stores the values of ArrayList highGrade.
        Integer[] convertHi = highGrade.toArray(new Integer[highGrade.size()]);
        int hiSize = convertHi.length;
        for(int i = 0; i < hiSize - 1; i++) {
            for(int j = 0; j < hiSize - i - 1; j++) {
                if(convertHi[j] > convertHi[j+1]) {
                    int temp = convertHi[j];
                    convertHi[j] = convertHi[j+1];
                    convertHi[j+1] = temp;
                }
            }
        }
        //Prints the sorted convertHi Array.
        System.out.println("High Grade");
        for(int i = 0; i < convertHi.length; i++) {
            System.out.println(convertHi[i]);
        }
        //prints the sorted convertLo Array.
        System.out.println("Low Grade");
        for(int i = 0; i < convertLo.length; i++) {
            System.out.println(convertLo[i]);
        }
    }
}
