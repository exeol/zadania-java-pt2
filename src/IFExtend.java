interface Aa {
    void meth1();
    void meth2();
}


interface Bb extends Aa {
    void meth3();
}

class MyClass45 implements Bb {
   public void meth1() {
       System.out.println("Implementacja metody 1");
   }

   public void meth2() {
       System.out.println("Implementacja metody 2");
   }

   public void meth3() {
       System.out.println("Impelementacja metody 3");
   }
    }




public class IFExtend {
    public static void main(String args[]) {
        MyClass45 ob = new MyClass45();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
