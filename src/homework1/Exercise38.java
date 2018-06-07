package homework1;

public class Exercise38 {
    public static void main(String args[]) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        char[] ch = test.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for(int x = 0; x < test.length(); x++){
            if(Character.isLetter(ch[x])) {
                letter++;
            }
            else if(Character.isDigit(ch[x])) {
                num++;
            }
            else if(Character.isSpaceChar(ch[x])) {
                space ++;
            }
            else
                other++;
        }

        System.out.println("letter: " + letter + " num " + num + " space" + space + " other " + other);

    }
}
