package homework1;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String args[]) {
        int decimalNumbe = 0;
        Scanner in = new Scanner(System.in);
        int octalNumber;
        int y;
        double z = 0;



        System.out.println("give me octal number: ");
        octalNumber = in.nextInt();

        while(octalNumber != 0) {
            int x = octalNumber % 10;
            y = (int) Math.pow(8, z);
             decimalNumbe = decimalNumbe + x * y;
             z += 1;
             octalNumber /= 10;
        }

        System.out.println(decimalNumbe);
    }
}
