package homework1;

import java.util.Scanner;
public class Exercise19 {
    public static void main(String args[]) {
        int[] table = new int[100];
        Scanner decNumber = new Scanner(System.in);
        int i = 1;

        System.out.println("Give me decimal number: ");
        int x = decNumber.nextInt();

        while(x != 0) {
            table[i++] = x % 2;
            x /= 2;
        }
        for(int j = i-1; j > 0; j--) {
            System.out.print(table[j]);
        }

    }

}
