
class TwoDShape {
    private double width;
    private double height;

    //konstruktor domyślny
    TwoDShape() {
        width = height = 0.0;
    }

    //konstruktor klasy bazowej
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    //konstruktor kolejny
    TwoDShape(double x) {
        width = height = x;
    }

    //konstruktor wykorzystujący obiekt.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }


    //metody dostępowe do skłądowych prywatnych
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) { width = w;}
    void setHeight(double h) {height = h;}

    void showDim() {
        System.out.println("Szerokość i wysokość obiektu: " + width + " i " + height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    //konstruktor domyślny
    Triangle() {
        super();
        style = "nieokreślony";
    }

    //konstruktor
    Triangle(String s, double w, double h) {
        super(w, h); // odwołanie do konstruktora klasy bazowej


        style = s;
    }

    //i konstruktor o jednym parametrze
    Triangle(double x){
        super(x);
        style = "wypełniony";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth()* getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }

}

//klasa pochodna klasy triangle
class colorTriangle extends Triangle {
    private String color;

    colorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() { return color;}
    void showColor() {
        System.out.println("Kolor: " + color);
    }
}

class shapes {
    public static void main(String arg[]) {
        Triangle t1 = new Triangle("pusty", 8.0, 12.0);
        Triangle t2 = new Triangle(t1);


        System.out.println("Informacje o t1: ");
        t1.showStyle();
        t1.showDim();

        System.out.println("Powierzchnia wynosi " + t1.area());

        System.out.println();

        System.out.println("Informacje o t2: ");
        t2.showStyle();
        t2.showDim();
        
        System.out.println("Powierzchnia wynosi " + t2.area());

        System.out.println();


    }
}



