package homework1;

import java.util.Scanner;

public class Exercise64 {
    public static void main(String args[]) {
        int x = 0;
        int y = 0;
        Scanner in = new Scanner(System.in);
        while((x < 25 || x > 75) && (y < 25 || y > 75)) {
            System.out.println("input first number(25-75):");
            x = in.nextInt();
            System.out.println("input second number(25-75):");
            y = in.nextInt();
        }
        int k,l,m,n;
        k = x/10;
        l = x % 10;
        m = y/10;
        n = y % 10;
        System.out.println(k == l || k == m || k == n || l ==m || l == n || m == n);




    }
}
