package bookpackext;
import bookpack.*;


class Usebook {
    public static void main(String arg[]) {
        Book books2[] = new Book[5];

        books2[0] = new Book("książka 1", "autor1", 1978);
        books2[1] = new Book("książka 2", "autor 2", 2015);
        books2[2] = new Book("książka 3", "autor 3", 2013);
        books2[3] = new Book("książka 4", "autor 4", 1999);
        books2[4] = new Book("książka 5", "autor 5", 1997);

        for(int i = 0; i < books2.length; i ++) books2[i].show();
    }
}
