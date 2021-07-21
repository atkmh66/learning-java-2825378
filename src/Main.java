import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("TextOut From IntelliJ");

        int studentAge = 15;
        double studentGpa = 3.45;
        String studentFirstName = "Mark";
        String studentLastName = "Atkinson";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

      //  System.out.println(studentFirstName);
      //  System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " " +
                "has a GPA of: " + studentGpa);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGpa = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " " +
                "Now has a GPA of: " + studentGpa);
    }
}







