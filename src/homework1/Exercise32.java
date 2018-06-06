package homework1;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.println("give me first number: ");
        x = in.nextInt();
        System.out.println("give me second number: ");
        y = in.nextInt();

        if(x != y)
            System.out.println(x + " != " + y);
        else
            System.out.println(x + " = " +y);

        if(x < y)
            System.out.println(x + " < " + y);
        else
            System.out.println(x + " > " + y);

        if(x <= 39)
            System.out.println(x + " <= " + y);
        else
            System.out.println(x + " > " + y);
    }
}
