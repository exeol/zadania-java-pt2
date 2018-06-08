package homework1;

import java.util.Scanner;

public class Exercise57 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        System.out.println("Input your number: ");
        int number = in.nextInt();

        for(int i = 1; i <= number; i++) {
            if(number % i == 0)
                counter += 1;
        }
        System.out.println(counter);
    }
}
