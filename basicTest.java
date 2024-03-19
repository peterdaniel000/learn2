import java.util.Scanner;

public class basicTest {
	public static void main (String[] args) {
		System.out.println("Welcome to the test");
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your name?");
		String txt = scan.next();

		System.out.println(" QUESTION 1: what is 2 + 2 in words");
		String ans1 = scan.next();

		while (!ans1.equals("four")) {
			System.out.println("you have the wrong answer try again what is 2 + 2? : ");
			ans1 = scan.next();

		}
		System.out.println("you are correct");
		System.out.println("what is your name");
		String ans2 = scan.next();

		while (!ans2.equals(txt)) {
			System.out.println("please try again");
			ans2 = scan.next();
		}
		System.out.println("very good");
	}
}
