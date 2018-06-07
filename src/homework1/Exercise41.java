package homework1;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("input char: ");
        String x = in.nextLine();
        char[]  y = x.toCharArray();
        int z = y[0];
        System.out.println(z);
    }
}
