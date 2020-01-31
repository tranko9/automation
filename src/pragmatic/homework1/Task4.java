package pragmatic.homework1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A");
		double a = sc.nextDouble();

		System.out.println("Enter B");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println(b);
			System.out.println(a);

		} else {
			System.out.println(a);
			System.out.println(b);

		} 
	}

}
