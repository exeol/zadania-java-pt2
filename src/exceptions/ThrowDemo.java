package exceptions;

public class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("przed instrukcją throw.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("wyjątek przechwycony");
        }
        System.out.println("za blokiem try/catch");
    }
}
