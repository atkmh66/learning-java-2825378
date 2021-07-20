import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {
    public static void main(String[] args) {
        // System.out.println("TextOut From IntelliJ");

        int studentAge = 15;
        double studentGpa = 3.45;
        String studentFirstName = "Mark";
        String studentLastName = "Atkinson";
        //char studentFirstInitial = 'M';
        char studentFirstInitial = studentFirstName.charAt(0);
        //char studentLastInitial = 'A';
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGpa);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
    }
}







