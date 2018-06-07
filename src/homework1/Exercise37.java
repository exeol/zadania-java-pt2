package homework1;
import java.util.Scanner;
public class Exercise37 {
    public static void main(String args[]) {

        Scanner in =  new Scanner(System.in);

        System.out.println("input sentence: ");
        String str = in.nextLine();

        for(int x = str.length() -1; x >= 0; x--) {
            System.out.print(str.charAt(x));
        }
    }
}
