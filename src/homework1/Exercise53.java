package homework1;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = in.nextInt();
        System.out.println("input second number: ");
        int y = in.nextInt();
        System.out.println("input third number: ");
        int z = in.nextInt();
        System.out.println(method(x, y, z, true));


    }

    public static boolean method(int x, int y, int z, boolean xyz) {
        if(xyz)
            return(z > y);
        return(y > x && z > y );


    }

}
