package homework1;

import java.util.Scanner;

public class Exercise56 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int firstN;
        int secondN;
        int thirdN;

        System.out.println(" input first number: ");
        firstN = in.nextInt();
        System.out.println("input second number: ");
        secondN = in.nextInt();
        System.out.println("input third number: ");
        thirdN = in.nextInt();

        for(int i = firstN; i <= secondN; i++ ){
            if(i % thirdN == 0)
                System.out.print(i + " ");
        }
    }
}
