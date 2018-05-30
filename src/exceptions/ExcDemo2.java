package exceptions;

class ExcTest2 {
    static void getException() {
        int nums[] = new int[4];

        System.out.println("Przed wygenerowaniem wyjątku");

        nums[7] = 10;
        System.out.println("ten komunikat nie zostanie wyświetlony");
    }
}

public class ExcDemo2 {
    public static void main(String args[]) {

        try {
            ExcTest2.getException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println("Indeks spoza zakresu!");
        }
        System.out.println("za klauzulą catch");
    }
}
