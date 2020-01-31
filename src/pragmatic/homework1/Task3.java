package pragmatic.homework1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A");
		double a = sc.nextDouble();

		System.out.println("Enter B");
		double b = sc.nextDouble();

		double swap = a;
		a = b;
		b = swap;

		System.out.println("New value of A is " + a);
		System.out.println("New value of B is " + b);

	}
} 