package homework1;

import java.util.Scanner;

public class Exercise59 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("input your sentence: ");
        String sentence = in.nextLine();
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
    }
}
