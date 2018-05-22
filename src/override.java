class ovvA {
    int i, j;
    ovvA(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println(" i i j: " + i + " " + j);
    }

}

class ovvB extends ovvA {
    int k;

    ovvB(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //metoda przesłaniająca metodę z klasy ovvA
    void show() {
        super.show();
        System.out.println("k: " +k);
    }
}



public class override {
    public static void main(String arg[]) {

        ovvB object = new ovvB(1, 2, 3);

        object.show();

    }
}
