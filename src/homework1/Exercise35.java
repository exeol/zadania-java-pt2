package homework1;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String args[]) {
        double area, n, s;

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number of sides of the polygon: ");
        n = in.nextDouble();
        System.out.println("Input the length of the sides: ");
        s = in.nextDouble();

        area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println(area);
    }
}
