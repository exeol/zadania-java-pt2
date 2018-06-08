package homework1;

public class cw3Againg {
    public static void main(String args[]) {

        piz a = new piz(24, 20);
        piz b = new piz(32, 39);
        piz c = new piz(40, 55);

        double profa = a.profitable(a.diameter, a.price);
        double profb = b.profitable(b.diameter, b.price);
        double profc = c.profitable(c.diameter, c.price);

        System.out.println(profa);
        System.out.println(profb);
        System.out.println(profc);

    }
}

class piz {
    double diameter;
    int price;
    double profit;

    piz(int diameter, int price){
        this.diameter = diameter;
        this.price = price;
    }

    double profitable(double x, int y) {
        return profit = Math.PI * (Math.pow(diameter/2, 2)) / price;
    }

}
