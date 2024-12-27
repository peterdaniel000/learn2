import java.util.Scanner;

public class GPAGenarator {
    public static void main(String[] args) {
        System.out.println("How many courses do you offer this semester?");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] numberOfCourse = new double[x];
        double sum = 0;

        for (int i = 0; i < numberOfCourse.length; i++) {
            System.out.println("Enter your average for the course " + (i + 1) + ":  ");
            numberOfCourse[i] = scan.nextDouble();
        }

        for (int i = 0; i < numberOfCourse.length; i++) {
            sum = sum + numberOfCourse[i];
        }

        double average = sum / numberOfCourse.length;
        
        if (average > 90) {
            System.out.println("A " +"FIRST CLASS" );
        }
        else if (average <= 90 && average >= 80) {
            System.out.println("B+ " + "SECOND CLASS UPPER");
        }
        else if (average < 80 && average >= 70) {
            System.out.println("B- " + "SECOND CLASS LOWER");
        }
        else if (average < 70 && average >= 60) {
            System.out.println("C " + "THIRD CLASS");
        }
        else {
            System.out.println("REPEAT THE SEMESTER");
        }

        System.out.println("Your average is "+ average);
        scan.close();
    }
}
