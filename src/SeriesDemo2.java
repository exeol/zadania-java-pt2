class SeriesDemo2 {
    public static void main(String arg[]) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;


        for(int i =0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Kolejna wartość sekwencji ByTwos: " + ob.getNext());

            ob = threeOb;
            System.out.println("Kolejna wartość sekwencji ByThrees: " + ob.getNext());
        }
    }
}
