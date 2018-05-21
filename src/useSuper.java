class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i w klasie bazowej: " + super.i);
        System.out.println(" i w klasie pochodnej: " + i);
    }
}





public class useSuper {
    public static void main(String arg[]) {
        B subOb = new B(1, 3);

        subOb.show();
    }
}
