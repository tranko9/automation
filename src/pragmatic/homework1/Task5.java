package pragmatic.homework1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A");
		int a = sc.nextInt();

		System.out.println("Enter B");
		int b = sc.nextInt();

		System.out.println("Enter C");
		int c = sc.nextInt();

		if (a > b && b > c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

		} else if (a > c && c > b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		} else if (b > c && c > a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		} else if (b > a && a > c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		} else if (c > a && a > b) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);

		} else if (c > b && b > a) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}

	}

}
