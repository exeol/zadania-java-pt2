package homework1;

import java.util.Scanner;

public class Exercise62 {
    public static void main(String args[]) {
        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("input three integers and press enter after each of them: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        System.out.println(Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20 );

    }

}
