package pragmatic.homework3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double[] arr = new double[10];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = i * 3;
            System.out.println(arr[i]);

        }
    }
}





