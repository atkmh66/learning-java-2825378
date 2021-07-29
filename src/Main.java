import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String question = "What is the answer to Life, the Universe, and Everything";
        String choiceOne = "work";
        //String choiceTwo = "42";
        String choiceTwo = "jupiter";
        String choiceThree = "mice";

        String correctAnswer= choiceTwo;
        String inputAnswer = "";

        System.out.println(question);
        System.out.println("Possible choices are: "+ choiceOne + ", " + choiceTwo + ", " + choiceThree);
        inputAnswer = inputScaner.next();
//        System.out.println(inputAnswer); // debug code
//        System.out.println(correctAnswer); // debug code

        if (correctAnswer.equals( inputAnswer.toLowerCase() )) {// can also use inputAnswer.toLowerCase() allows all input
                                                  // if all the answers were defined as lowwer case to start with
            System.out.println("That Is Correct.  Well Done !!");
        } else {
            System.out.println("That answer was incorrect.");
            System.out.println("The correct answer is: " + correctAnswer );
        }
    }
}







