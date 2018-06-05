package homework1;

import java.util.Scanner;
public class Exercise21 {
    public static void main(String args[]){
        int[] table = new int[100];
        int x = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("please give me decimal number: ");
        int number = in.nextInt();

        while(number != 0) {
            table[x++] = number % 8;
            number /= 8;
        }

        for(int j = x - 1; j > 0; j--) {
            System.out.print(table[j]);
        }
    }
}
