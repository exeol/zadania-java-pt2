package homework1;

import java.util.Scanner;

public class Exercise58 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sentence;

        System.out.println("Give me sentence: ");
        sentence = in.nextLine();
        char[] sentence2 = sentence.toCharArray();

        for(int i = 0; i < sentence2.length; i++){
            if(i == 0)
                sentence2[i] = (char) ((int) sentence2[i] & 65503);
            if(Character.isSpaceChar(sentence2[i])) {
                sentence2[i + 1] = (char) ((int) sentence2[i + 1] & 65503);
            }
        }



        for(int i = 0; i < sentence2.length; i++)
            System.out.print(sentence2[i]);
        }

    }

