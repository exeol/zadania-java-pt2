class Sup {
    void who() {
        System.out.println("who() klasy Sup");
    }
}


class Sub1 extends Sup {
    void who() {
        System.out.println("who() klasy Sub1");
    }
}


class Sub2 extends Sup {
    void who() {
        System.out.println("who() klasy Sub2");
    }
}





public class DynamDispl {
    public static void main(String arg[]) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef; // zmienna referencyjna klasy

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
