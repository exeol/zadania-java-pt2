package homework1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String args[]) {
        Scanner data1 = new Scanner(System.in);

        System.out.println("pleas give me number: ");
        int detal = data1.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(detal + " * " + i + " = " + detal * i);
        }
    }
}
