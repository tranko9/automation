package pragmatic.homework1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A1");
		int a1 = sc.nextInt();

		System.out.println("Enter A2");
		int a2 = sc.nextInt();

		System.out.println("Enter A3");
		int a3 = sc.nextInt();

		int swap1 = a1;
		int swap2 = a2;
		a1 = swap2;
		a2 = a3;
		a3 = swap1;

		System.out.println("New value of A1 is " + a1);
		System.out.println("New value of A2 is " + a2);
		System.out.println("New value of A3 is " + a3);

	}
}