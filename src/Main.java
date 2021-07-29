import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time ...");
        System.out.println("Type in a random work and press Enter to start developer Tea Time");
        Scanner input = new Scanner(System.in);
        input.next();// Without making an assignment, what ever we type and press enter will allow continuation
        System.out.println("It's developer Tea Time");
    }
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}