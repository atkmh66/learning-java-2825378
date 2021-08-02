import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Main {

    public static void calculatetotalmealprice( double listedMealPrice,
                                                double tipRate,
                                                double texRate) {
        double tip = tipRate * listedMealPrice;
        double tax = texRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);

    }
    public static void main(String[] args) {
        calculatetotalmealprice(15, 0.2, 0.08);
        calculatetotalmealprice(25, 0.18, 0.08);


    }

}