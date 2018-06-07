package homework1;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = in.nextInt();
        System.out.println("input second number: ");
        int y = in.nextInt();
        System.out.println("input third number: ");
        int z = in.nextInt();

        if(x + y == z)
            System.out.println("true");
    }
}
