package homework1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number ");
        int data1 = in.nextInt();
        System.out.println("Input second number ");
        int data2 = in.nextInt();

        System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));

        System.out.println(data1 + " - " + data2 + " = " + (data1 - data2));

        System.out.println(data1 + " x " + data2 + " = " + (data1 * data2));

        System.out.println(data1 + " / " + data2 + " = " + (data1 / data2));
    }

}
