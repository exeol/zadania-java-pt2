package homework1;

import java.util.Scanner;
public class Exercise22 {
    public static void main(String args[]) {
        int j = 1;
        long reminder;
        long decimalnumber = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("give me binary number: ");
        int binarynumber = in.nextInt();

        while(binarynumber != 0) {
            reminder = binarynumber % 10;
            decimalnumber = decimalnumber + reminder * j;
            j *= 2;
            binarynumber /= 10;

        }
        System.out.println(decimalnumber);

    }
}
