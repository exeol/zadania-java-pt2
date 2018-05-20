import sun.awt.AWTAccessor;

class TwoDShape {
    private double width;
    private double height;

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

    //konstruktor
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth()* getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }

}

class shapes {
    public static void main(String arg[]) {
        Triangle t1 = new Triangle("wypełniony", 4.0, 5.0);
        Triangle t2 = new Triangle("pusty", 8.0, 12.0);


        System.out.println("Informacje o t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Powierzchnia wynosi " + t1.area());

        System.out.println("Informacje o t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Powierzchnia wynosi " + t2.area());
    }
}



