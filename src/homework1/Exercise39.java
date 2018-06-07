package homework1;

public class Exercise39 {
    public static void main(String args[]) {
        int i, j, k, howmany;
        howmany = 0;

        for(i = 1; i < 5; i++) {
            for(j = 1; j < 5; j++) {
                for(k = 1; k < 5; k++) {
                    if(i != j && j != k && i != k) {
                        howmany++;
                        System.out.println(i + " " + j + " " + k);

                    }
                }
            }
        }
        System.out.println(howmany);
    }
}
