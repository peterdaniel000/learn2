import java.util.Scanner;

class learn{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double Score = scan.nextDouble();

        if (Score >= 70) {
            System.out.println("A");
        }
        else if (Score >= 60) {
            System.out.println("B");
        }
        else if (Score >= 50) {
            System.out.println("C");
        }
        else if (Score >= 45) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        scan.close();
        


    }
}