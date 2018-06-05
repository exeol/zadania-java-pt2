package homework1;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String args[]) {

        int y = 1;
        int decimalNumber = 0;
        Scanner binIn = new Scanner(System.in);

        System.out.println("Give binary number: ");
        int binNumber = binIn.nextInt();

        while(binNumber > 0) {
            int x = binNumber % 10;
            decimalNumber = decimalNumber + x * y;
            y *= 2;
            binNumber /= 10;

        }
        System.out.println(decimalNumber);



        y = 1;
        int[] table = new int[100];

        while(decimalNumber != 0) {
            table[y++] = decimalNumber % 16;
            decimalNumber /= 16;
        }

        for(int j = y-1;j >0; j--){
            if(table[j] >= 9){
                System.out.print((char) (table[j] + 55));

            }
            else {
                System.out.print(table[j]);
            }
        }

    }
}
