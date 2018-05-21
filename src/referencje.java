class XX {
    int a;
    boolean t;

    XX(int i) {
        a = i;
    }

    XX(boolean test) {
        t = test;
    }
}

class YY extends XX {
    int b;

    YY(int i, int j) {
        super(j);
        b = i;
    }
}




public class referencje {
    public static void main(String arg[]) {
        XX x = new XX(10);
        YY y = new YY(5, 6);
        XX xx = new XX(false);
        XX x2;


        System.out.println(y.a + "   " +y.b);
        System.out.println(x.a + "   " );
        System.out.println();


        x2 = x;
        System.out.println(x2.a);
        x2 = y;
        System.out.println(x2.a + "   ");
        x2 = xx;
        System.out.println(xx.t);

        


    }


}
