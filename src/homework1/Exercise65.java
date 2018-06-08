package homework1;

import java.util.Scanner;

public class Exercise65 {
    public static void main(String args[]) {
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.println("input first number: ");
        x = in.nextInt();

        System.out.println("input second number: ");
        y = in.nextInt();

        int z = x/y;

        int result = x - (z * y);
        System.out.println(result);

    }
}
