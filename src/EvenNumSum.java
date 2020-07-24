import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int n, sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		n = scan.nextInt();
		if (n < 2) {
			System.out.println("ERROR: Integer is less than 2.");
			System.out.print("Enter an integer greater than 2: ");
			n = scan.nextInt();
		}

		if (n % 2 != 0)
			n--;

		int k = n / 2;
		sum = k * (k + 1);
		System.out.println("The required sum is " + sum);
	}
}
