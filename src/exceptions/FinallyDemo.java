package exceptions;


import javax.jws.soap.SOAPBinding;

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Otrzymuję" + what);
        try {
            switch (what) {
                case 0:
                    t = 10;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exc) {

            System.out.println("Nie wolno dzielić przez 0!");
            return;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Brak odpowiedniego elementu tablicy");
        }
        finally {
            System.out.println("Opuszczam blok try");
        }
    }
}

public class FinallyDemo {
    public static void main(String args[]) {
        for(int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
