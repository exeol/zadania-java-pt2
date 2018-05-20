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
    String style;

    double area() {
        return getWidth()* getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }

}

class shapes {
    public static void main(String arg[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "wypełniony";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "pusty";

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



