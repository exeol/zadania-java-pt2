package homework1;


class pizza {
    double diameter;
    int price;

    pizza(int diamter, int price) {
        this.diameter = diamter;
        this.price = price;
    }

    double profitability(double x, int y) {
         double profit = (Math.PI * Math.pow(x/2, 2))/y;
        return profit;
    }


}

public class cwHome3 {
    public static void main(String args[]) {

        pizza roma = new pizza(32, 31);

        pizza capriciosa = new pizza( 32, 37);

        pizza margeritha = new pizza(40, 32);

        double x = roma.profitability(roma.diameter, roma.price);
        System.out.println("Profitability of pizza roma: " + x);

        double y = capriciosa.profitability(capriciosa.diameter, capriciosa.price);
        System.out.println("Profitability of pizza capriciosa: " + y);

        double z = margeritha.profitability(margeritha.diameter, margeritha.price);
        System.out.println("Profitability of pizza margaritha: " + z);

    }
}
