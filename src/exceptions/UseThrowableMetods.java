package exceptions;

class ExcTest4 {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("przed wygenerowaniem wyjątku.");

        nums[7] = 10;
        System.out.println("ten komunikat nie zostanie wyświetlony");
    }
}

public class UseThrowableMetods {
    public static void main(String args[]) {

        try {
            ExcTest4.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println("standardowy komunikat o błędzie: ");
            System.out.println(exc);
            System.out.println();
            System.out.println();
            System.out.println(" Stos wywołań: ");
            exc.printStackTrace();
        }
    }
}
