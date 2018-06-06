package homework1;

import java.util.Scanner;

public class exercise33 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x, y = 0;

        System.out.println("pleas input number: ");
        x = in.nextInt();

        while(x !=0 ){
            y = y + x % 10;
            x /= 10;

        }
        System.out.println(y);
    }
}
