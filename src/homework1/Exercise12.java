package homework1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input first number:");
        int data1 = inp.nextInt();
        System.out.println("input second number:");
        int data2 = inp.nextInt();
        System.out.println("inpu third number: ");
        int data3 = inp.nextInt();
        int average = (data1 + data2 + data3) / 3;
        System.out.println(average);
    }
}
