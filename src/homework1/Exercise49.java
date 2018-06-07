package homework1;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int x = in.nextInt();

        if( x % 2 != 0)
            System.out.println(0);
        else
            System.out.println(1);



    }
}
