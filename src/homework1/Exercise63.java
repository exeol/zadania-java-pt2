package homework1;

import java.util.Scanner;

public class Exercise63 {
    public static void main(String args[]) {
        int x, y, smaller, bigger;
        Scanner in = new Scanner(System.in);

        System.out.println("input first number: ");
        x = in.nextInt();
        System.out.println("input second number: ");
        y = in.nextInt();

        if(x>y) {
            smaller = y;
            bigger = x;
        }
        else {
            smaller = x;
            bigger = y;
        }

        if(x % 6 == y % 6)
            System.out.println(smaller);
        else if( x == y)
            System.out.println("0");
        else
            System.out.println(bigger);
    }
}
