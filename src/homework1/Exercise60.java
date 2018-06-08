package homework1;

import java.util.Scanner;

public class Exercise60 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("input your sentence: ");
        String sentence = in.nextLine();

        String[] sent = sentence.split(" ");

        for(int i = 0; i < sent.length; i++) {
            System.out.print(sent[i] + " ");

        }
        System.out.println(sent[sent.length - 2]);
    }
}
