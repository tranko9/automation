package pragmatic.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A");
		double a = sc.nextDouble();

		System.out.println("Enter B");
		double b = sc.nextDouble();

		System.out.println("Enter C");
		double c = sc.nextDouble();

		if (c >= a && c <= b) {
			System.out.println("Number " + c + " is between " + a + " and " + b);

		} else {
			System.out.println("Number " + c + " is NOT between " + a + " and " + b);
		}

	}
	

} 
