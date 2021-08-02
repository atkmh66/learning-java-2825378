import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Main {

    public static double calculateTotalMealPrice( double listedMealPrice,
                                                double tipRate,
                                                double texRate) {
        double tip = tipRate * listedMealPrice;
        double tax = texRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
//        System.out.println("Your total meal price is " + result);

    }
    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, 0.2, 0.08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }

}