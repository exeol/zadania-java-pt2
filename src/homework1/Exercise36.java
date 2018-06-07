package homework1;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String args[]) {
        double d;
        double radius = 6371.01;
        double x1, y1, x2, y2;
        Scanner in = new Scanner(System.in);


        System.out.println("input the latitude of coordinate 1: ");
        x1 = in.nextDouble();
        System.out.println("input the longitude of coordinate 2: ");
        y1 = in.nextDouble();

        System.out.println("input the latitude of coordinate 1: ");
        x2 = (double) in.nextDouble();
        System.out.println("input the longitude of coordinate 2: ");
        y2 = in.nextDouble();

        x1 = Math.toRadians( x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println(d);
    }

}
