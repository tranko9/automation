package pragmatic.homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it? ");
        int hour = sc.nextInt();

        System.out.println("How much money do you have? ");
        double money = sc.nextDouble();

        System.out.println("Are you healthy? ");
        boolean health = sc.nextBoolean();

        if (!health) {
            System.out.println("You are not going anywhere... ");
            if (money > 10) {
                System.out.println("Take some medicine! ");
            } else {
                System.out.println("Drink tea at home! ");
            }
        } else if (health) {
            if (money < 10) {
                System.out.println("Go out and drink coffee!  ");
            } else if (money > 10) {
                System.out.println("Go to the mall! ");
            }
        }
    }
}