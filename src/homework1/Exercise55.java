package homework1;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("please input seconds: ");
        int z = in.nextInt();
        int hours;
        int minuts;
        int seconds;
        hours = z / 3600;
        minuts = (z % 3600) / 60;
        seconds = ((z % 3600) % 60);

        System.out.println(hours + " : " + minuts + " : " + seconds );
    }
}
