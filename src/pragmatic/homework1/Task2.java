package pragmatic.homework1;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A");
		double a = sc.nextDouble();
		
		System.out.println("Enter B");
		double b = sc.nextDouble();
		
		double sum = a + b; 
		double sub = a - b;
		double mul = a * b;
		double div = a / b; 
		double rem = a % b;
		
		System.out.println("Additive is " + sum);
		System.out.println("Substraction is " + sub);
		System.out.println("Multiplication is " + mul);
		System.out.println("Division is " + div);
		System.out.println("Remainder is " + rem);

	} 
}
