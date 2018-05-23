package bookpackext;


class ExtBook extends  bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {return publisher;}
    public void setPublisher(String p) {publisher = p;}


    public String getTitle() {return title;}
    public void setTitle(String t) {title = t;}
    public String getAuthor() {return author;}
    public void setAuthor(String a) {author = a;}
    public int getpubDate() {return pubDate;}
    public void setpubDate(int d) {pubDate = d;}


}



class ProtectDemo {
    public static void main(String arg[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("książka 1", "autor1", 1978, "helion");
        books[1] = new ExtBook("książka 2", "autor1", 2015, "helion");
        books[2] = new ExtBook("książka 3", "autor 3", 2013, "PIW");
        books[3] = new ExtBook("książka 4", "autor 4", 1999, "PIW");
        books[4] = new ExtBook("książka 5", "autor 5", 1997, "Amber");


        for(int i = 0; i < books.length; i++) books[i].show();

        //wyszukuje książki konkretnego autora
        System.out.println(" Wszystkie tytuły, których autorem jest Schildt.");
        for(int i =0; i < books.length; i++)
            if(books[i].getAuthor() == "autor1")
                System.out.println(books[i].getTitle());

        //      books[0].title = "test title";      //błąd - składowa nie jest dostępna
    }
}
