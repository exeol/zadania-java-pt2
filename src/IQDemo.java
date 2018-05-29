class FixedQueue implements ICharQ {
    private char q[];    //tarblica, która będzie przechowywać elementy kolejki
    private int putloc, getloc;  //indeksy operacji put i get

    //Tworzy pustą kolejkę o podanym rozmiarze
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //umieszczanie znaku w kolejce
    public void put(char ch) {
        if(putloc == q.length) {
            System.out.println("  -- Kolejka pusta.");
            return;
        }

        q[putloc++] = ch;
    }

    //pobieranie znaku z kolejki
    public char get() {
        if(getloc == putloc) {
            System.out.println("  -- Kolejka pusta.");
            return (char) 0;
        }

        return q[getloc++];
    }
}



//kolejka cykliczna
class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;


    //metoda tworząca kolejkę o podanym rozmiarze
    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    //metoda umieszczająca znak w kolejce
    public void put(char ch) {
        if(putloc+1 == getloc | ((putloc ==q.length-1) & (getloc == 0))) {
            System.out.println("  -- Kolejka pełna.");
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length) putloc = 0;
    }


    //metoda pobierająca znak z kolejki
    public char get() {
        if(getloc == putloc) {
            System.out.println("  -- Kolejka psuta.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if(getloc == q.length) getloc = 0;  //powrót na początek tablicy
        return ch;
    }
}


//kolejka dynamiczna, zwiększająca wielkość w razie potrzeby
class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    //konstruktor tworzący pustą kolejkę o podanym rozmiarze
    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if(putloc == q.length) {
            //zwiększa rozmiar kolejki
            char t[] = new char[q.length * 2];

            //kopiuje elementy do nowej kolejki
            for(int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;



    }


    public char get() {
        if(getloc == putloc) {
            System.out.println("  -- Kolejka pusta.");
            return (char)  0;
        }

        return q[getloc++];
    }
}






public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        //umieszczamy znaki w kolejce o stałym rozmiarze.
        for(i = 0; i < 10; i ++)
            iQ.put((char) ('A' + i));

        //wyświetlamy zawartość kolejki
        System.out.println("Zawartość kolejki o stałym rozmiarze: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        //umieszczam znaki w kolejce dynamicznej
        for(i = 0; i < 10; i ++)
            iQ.put((char) ('Z' - i));

        //wyświetlam zawartość kolejki dynamicznej
        System.out.println("Zawartość kolejki o dynamicznej: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        //umieszczam znaki w kolejce cyklicznej
        for(i = 0; i < 10; i ++)
            iQ.put((char) ('A' + i));

        //wyświetlamy zawartość kolejki
        System.out.println("Zawartość kolejki cyklicznej ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();


        //Umieszczam więcej znaków w kolecje cyklicznej.
        for(i = 10; i < 20; i ++)
            iQ.put((char) ('A' + i));

        //wyświetlamy zawartość kolejki
        System.out.println("Zawartość kolejki cyklicznej więcej: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }


        System.out.println("\nUmieszczam i pobieram znak z kolejki cyklicznej");

        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

    }
}
