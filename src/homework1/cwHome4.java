package homework1;

import java.util.Scanner;

public class cwHome4 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("input word: ");
        String word = obj.nextLine();

        System.out.print(word + " ");
        System.out.print(word.charAt(0));

    }
}
