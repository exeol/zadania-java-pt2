
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    //konstruktor domyślny
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    //konstruktor z parametrami
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //tworzy obiekt, którego szerokość = wysokość
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    //konstruktor wykorzystujący obiekt.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }


    //metody dostępowe do skłądowych prywatnych
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) { width = w;}
    void setHeight(double h) {height = h;}

    String getName() {return name;}

    void showDim() {
        System.out.println("Szerokość i wysokość obiektu: " + width + " i " + height);
    }

    abstract double area();


}

class Triangle extends TwoDShape {
    private String style;

    //konstruktor domyślny
    Triangle() {
        super();
        style = "nieokreślony";
    }

    //konstruktor z parametrami
    Triangle(String s, double w, double h) {
        super(w, h, "trójkąt"); // odwołanie do konstruktora klasy bazowej


        style = s;
    }

    //i konstruktor o jednym parametrze
    Triangle(double x){
        super(x, "trójkąt");
        style = "wypełniony";
    }

    //konstruktor z obiektami
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





//klasa pochodna klasy bazowej TwoDShape reprezentująca prostokąty

class Rectangle extends TwoDShape {

    //konstruktor domyślny
    Rectangle() {
        super();
    }

    //konstruktor z parametrami
    Rectangle(double w, double h) {
        super(w, h, "prostokąt");
    }

    //konstruktor o jednym parametrze
    Rectangle(double x) {
        super(x, "prostokąt");
    }

    //konstruktor tworzący obiekt na podstawie innego obiektu
    Rectangle(Rectangle ob) {
        super(ob);
    }


    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }


    //przesłonia area() w klase rectangle
    double area() {
        return getHeight() * getWidth();
    }
}




class shapes {
    public static void main(String arg[]) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("pusty", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);


        for(int i=0; i < shapes.length; i++) {
            System.out.println("Typ obiektu: " + shapes[i].getName());
            System.out.println("Powierzchnia wynosi " + shapes[i].area());

            System.out.println();
        }



    }
}



