package homework1;

public class cw2Again {
    public static void main(String args[]) {

        calc obj = new calc(10, 23);
        obj.add(obj.x, obj.y);
        obj.substract(obj.x, obj.y);
        obj.multiple(obj.x, obj.y);
        obj.divide(obj.x, obj.y);


    }
}


    class calc {
        int x, y;
        calc(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void add(int x, int y) {
            System.out.println(x + y);
        }

        public void substract(int x, int y) {
            System.out.println(x - y);
        }

        public void divide(int x, int y){
            System.out.println(x/y);
        }

        public void multiple(int x, int y) {
            System.out.println(x*y);
        }
    }

