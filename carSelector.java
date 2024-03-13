/*
 * creating a car selector using scanner method and if else statement
 */

 // import the scanner method 
import java.util.Scanner;

// create class with the file name 

public class carSelector {

    // entry point of the program create you main method
    public static void main(String[] args) {
        System.out.println("Do_you_want_to_buy_a_car");

// use the Scanner method 
        Scanner scan = new Scanner(System.in);
        String ans1 = scan.next();

        // using the if else statement

        if (ans1.equals("yes")) {
            System.out.println("what color do you want");
// create another Scanner variables using the Scanner method
            Scanner scan1 = new Scanner(System.in);
            String ans2 = scan1.next();

            if (ans2.equals("red")) {
                System.out.println("We have it in stock, let go check it out ,which one do you like");

                    Scanner scan2 = new Scanner(System.in);
                    String ans3 = scan.next();

                    if (ans3.equals("stripe")) {
                        System.out.println("sold!!!!");
                    } else {
                        System.out.println("Is already sold");
                    }
                
            } else if (ans2.equals("blue")) {
                System.out.println("we do not have it but we could order for it");
            } else {
                System.out.println("we can't help you get those");
            }

        } else {
            System.out.println("thank for you patronage");
        }
    }
}