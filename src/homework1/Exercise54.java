package homework1;


import java.util.Scanner;

public class Exercise54 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = in.nextInt();
        System.out.println("input second number: ");
        int y = in.nextInt();
        System.out.println("input third number: ");
        int z = in.nextInt();
        int xx = x % 10;
        int yy = y % 10;
        int zz = z % 10;

        if(xx == yy || xx == zz || yy == zz)
            System.out.println(true);
    }
}
