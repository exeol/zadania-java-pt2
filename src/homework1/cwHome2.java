package homework1;


class homeWork {
    int x, y;

    homeWork(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(int x, int y) {
        System.out.println(x + y);
    }

    public void substract(int x, int y) {
        System.out.println(x - y);
    }

    public void multiply(int x, int y) {
        System.out.println(x * y);
    }

    public void divide(int x, int y) {
        System.out.println((double) x /y);
    }

}

public class cwHome2 {
    public static void main(String args[]) {

        homeWork obj = new homeWork(2, 3);

        obj.add(obj.x, obj.y);

        obj.substract(obj.x, obj.y);

        obj.multiply(obj.x, obj.y);

        obj.divide(obj.x, obj.y);



    }
}
