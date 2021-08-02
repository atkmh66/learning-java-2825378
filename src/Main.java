import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Main {

    public static double calculateEmployeeSalary(Integer hoursPerWeek, double hourlyRate, Integer vacationDays) {

       double yearlyHours = hoursPerWeek * 52;
       double totalHours  = yearlyHours - (vacationDays * 8 );


        double yearlyGrossSalary = totalHours * hourlyRate;
        return yearlyGrossSalary;
//        System.out.println("Your total meal price is " + result);

    }
    public static void main(String[] args) {
        double myEmployeeSalary = calculateEmployeeSalary(40, 15, 8);
        System.out.println("40/per week @ 15/hour, with 8 vacation days comes to :" +myEmployeeSalary);

    }

}