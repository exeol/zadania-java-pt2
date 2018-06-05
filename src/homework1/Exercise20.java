package homework1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] table = new int[100];
        int x = 1;

        System.out.println("Give me decimal number: ");
        int deci = in.nextInt();

        while(deci != 0) {
            table[x++] = deci % 16;
            deci /= 16;
        }


        for(int y = x - 1; y > 0; y--) {
            switch (table[y]) {
                case 15:
                    System.out.print('F');
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 10:
                    System.out.print("A");
                    break;
                default:
                    System.out.print(table[y]);

            }

        }
    }
}
