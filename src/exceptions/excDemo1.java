package exceptions;

public class excDemo1 {
    public static void main(String args[]) {
        int nums[] = new int[4];

        try {

            System.out.println("Przed wygenerowaniem wyjątku ");
            nums[0] = 10;
            System.out.println("ten komunikat nie zostanie wyświetlony");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("indeks spoza zakresu!");

        }

        System.out.println("index za klauzulą catch");
    }
}
