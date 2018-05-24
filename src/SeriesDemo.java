class SeriesDemo {
    public static void main(String arg[]) {
        ByTwos ob = new ByTwos();


        for(int i =0; i < 5; i++)
            System.out.println("Następna wartość: " + ob.getNext());

        System.out.println("\nREstart");
        ob.reset();

        for(int i =0; i < 5; i++)
            System.out.println("Następna wartość: " + ob.getNext());

        System.out.println("\nRozpoczynam od 100");
        ob.setStart(100);
        for(int i =0; i < 5; i++)
            System.out.println("Następna wartość: " + ob.getNext());
    }
}
