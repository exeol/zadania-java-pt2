import java.util.Scanner;


class Menu {
    int number;
    String text;
    animals anim;


    Menu() {
        number = 5;
        text = "smthing";
    }

    Menu(int number, String text) {
        this.number = number;
        this.text = text;
    }

    void retText() {
        System.out.println("I write smth");
    }

    public int retNumber() {
        return (int) number;
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public void nonStaticMethod() {
        System.out.println("This is non-static method");
    }

    public void giveClass () {
        System.out.println(text.getClass());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Menu(animals anim) {
        this.anim = anim;
    }




}


class Car {
    String name;
    int maxSpeed;



    //konstruktor
    Car() {
        name = "merc";
        maxSpeed = 200;
    }

    Car(String name) {
        this.name = name;
    }

    static int krowa;
    static Integer krowa2;
}

enum animals {
    dog,
    cat,
    bird,
    snake,
}

public class Main {

    static int aa;

    public static void main(String args[]) {



        Car myCar = new Car();
        System.out.println(myCar.name + " " +myCar.maxSpeed);


        Menu menu = new Menu();
        System.out.println(menu.number + " " + menu.text);

        Menu menu2 = new Menu(23, "sth");
        System.out.println(menu2.number + " " + menu2.text);


        System.out.println("/");
        int x = menu2.retNumber();
        System.out.println(x);
        System.out.println("/");
        menu2.retText();

        menu.nonStaticMethod();

        Menu.staticMethod();

        System.out.println(menu.getClass());

        menu2.giveClass();

        menu.setNumber(23);
        menu.setText("uhulala");

        System.out.println(menu.getNumber() + " " + menu.getText());

        System.out.println("----------------------------------");



        System.out.println(Car.krowa);
        System.out.println(Car.krowa2);
        System.out.println(aa);


        Menu animale = new Menu(animals.snake);
        System.out.println(animale.anim);

        System.out.println("----------------------------------");

        String name;
        Scanner yourName = new Scanner(System.in);
        name = yourName.nextLine();
        System.out.println(name);





    }


}
