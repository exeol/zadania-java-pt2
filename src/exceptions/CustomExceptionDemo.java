package exceptions;

class NonIntResultException extends Exception {
    int n;
    int d;

     NonIntResultException(int i, int j) {
        n = i;
        d = j;

    }

    public String toString() {
        return "wynik dzielenia " + n + " / " + d + " nie jest wartością całkowitą.";
    }
}

public class CustomExceptionDemo {
    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        for(int i = 0; i<numer.length; i++) {
            try {
                if((numer[i]%2 != 0))
                        throw  new NonIntResultException(numer[i], denom[i]);
                System.out.println(numer [i] + " / " + denom[i] + " równa się " + numer[i]/denom[i]);

            }
            catch (ArithmeticException exc) {
                System.out.println(" Nie wolno dzielić przez 0!");
            }

            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(" Brak odpowiedniego elementu tablicy");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
