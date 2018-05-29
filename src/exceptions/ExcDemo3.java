package exceptions;

public class ExcDemo3 {
    public static void main(String args[]) {
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = {2, 0, 4, 4, 0, 8 };

        for(int i =0; i<numer.length; i ++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " równa się " + numer[i]/denom[i]);

            }
            catch (ArithmeticException exc) {
                System.out.println("nie wolno dzielić przez 0!");
            }
            catch (Throwable exc) {
                System.out.println("wystąpił wyjątek");
            }
        }
    }

}
