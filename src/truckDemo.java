class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;


    //konstruktor klasy Vehicle
    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    int range() {
        return (int) (fuelcap / lkm * 100);
    }


    double fuelneeded(int km) {
        return (double) km / 100 * lkm;
    }

    //metody dostępowe do zmiennych składowych
    int getPassengers() { return  passengers;}
    void setPassengers(int p) {passengers = p;}
    int getFuelcap() { return fuelcap;}
    void setFuelcap(int f) {fuelcap = f;}
    double getLkm() { return lkm;}
    void setMpg(double l) { lkm = l;}
}

class Truck extends Vehicle {
    private int cargocap;

    //konstruktor klasy Truck
    Truck(int p, int f, double l, int c) {
        super(p, f, l);
        cargocap = c;
    }

    int getCargo() { return cargocap;}
    void  putCargo(int c) {cargocap = c;}
}





public class truckDemo {
    public static void main(String arg[]) {

        Truck semi = new Truck(2, 200, 25, 4);
        Truck pickup = new Truck(3, 80, 15, 1);
        double liters;
        int dist = 252;

        liters = semi.fuelneeded(dist);

        System.out.println("Półciężarówka przewozi " + semi.getCargo() + " tony ładunku.");
        System.out.println("Aby pokonać dystans " + dist + " kilometórw, półciężarówka potrzebuje " + liters + " litrów paliwa.\n");

        liters = pickup.fuelneeded(dist);

        System.out.println("Półciężarówka przewozi " + pickup.getCargo() + " tony ładunku.");
        System.out.println("Aby pokonać dystans " + dist + " kilometórw, pickup potrzebuje " + liters + " litrów paliwa.\n");

    }
}
