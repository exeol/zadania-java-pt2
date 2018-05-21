class aA {
   aA() {
       System.out.println("konstruktor klasy A");
   }
}

class bB extends aA {

    bB() {
        System.out.println("konstruktor klasy B");
    }
}

class cC extends bB {
    cC() {
        System.out.println("konstruktor klasy C");
    }
}





public class ABC {
    public static void main(String arg[]) {
        cC kl = new cC();
    }
}
