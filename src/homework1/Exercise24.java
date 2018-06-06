package homework1;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = 1;
        int decimalNumber = 0;


        System.out.println("give me binary number: ");
        int binNumber = in.nextInt();

        while(binNumber != 0) {
            int reminder = binNumber % 10;
            decimalNumber = decimalNumber + reminder * x;
            x *= 2;
            binNumber /=10;
        }

        System.out.println("decimal number = " + decimalNumber);


        int[] table = new int[100];
        x =1;
        while(decimalNumber != 0) {
            table[x++] = decimalNumber % 8;
            decimalNumber /= 8;
        }

        for(int y = x-1; y > 0; y--) {
        System.out.print(table[y]);}
    }
}
