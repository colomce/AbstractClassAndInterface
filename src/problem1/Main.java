package problem1;

import problem1.models.Chicken;
import problem1.models.Cock;
import problem1.models.Hen;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int numberOfCocks = new Cock().buy(i);
            int numberOfHens = new Hen().buy(i);
            int numberOfChickens = new Chicken().buy(i);
            int totalNumberOfFows = (numberOfCocks + numberOfHens + numberOfChickens);
            if (totalNumberOfFows == 100) {
                if (isPositiveNonNeutral(numberOfCocks) &&
                        isPositiveNonNeutral(numberOfHens) &&
                        isPositiveNonNeutral(numberOfChickens)) {

                    System.out.println("Cock: " + numberOfCocks + " " + "Hen: " + numberOfHens + " " + "Chickens: " + numberOfChickens);

                }
            }
        }

        /*
            Solution
            Cock: 4 Hen: 18 Chickens: 78
            Cock: 8 Hen: 11 Chickens: 81
            Cock: 12 Hen: 4 Chickens: 84
         */
    }

    /*
        Added isPositiveNonNeutral to check for non positive number.
        Should 0 be accepted, (num >= 0;)
        Another Solution: Cock: 0 Hen: 25 Chickens: 75
     */
    static boolean isPositiveNonNeutral(int num) {
        return num >= 1;
    }
}
