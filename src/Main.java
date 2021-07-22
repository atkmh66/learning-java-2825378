import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         System.out.println("Pick a number betweeen 1 and 10");
         Scanner scanner = new Scanner(System.in);

         int inputtedNumber = scanner.nextInt();

         if (inputtedNumber < 5 ) {
             System.out.println("Enjoy the good luck a friend brings you");
         } else {

             System.out.println("Your shoe selection will make you happy");
         }

    }
}







