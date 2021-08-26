import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentProfile myStudentA = new StudentProfile("Mike", "Hunt", 1943, 2.666,"Underwater Basket Weaving");
        StudentProfile myStudentB = new StudentProfile("Jack","Mehoff",1999,3.789,"Inflight Missle Repair");

        System.out.println(myStudentA.studentFirstName+" "+myStudentA.studentLastName +" expected graduation is "+myStudentA.expectedYearGraduate);
        myStudentA.incrementGradYear();
        System.out.println("After class delays, "+myStudentA.studentFirstName+"'s graduation will be "+myStudentA.expectedYearGraduate);


    }

}