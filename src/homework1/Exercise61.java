package homework1;

import java.util.Scanner;

public class Exercise61 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("input word: ");
        String word = in.nextLine();

        char[] word2 = word.toCharArray();

        for(int i = word2.length -1; i >= 0; i --){
            System.out.print(word2[i]);
        }
    }
}
