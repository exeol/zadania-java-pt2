class FixedQuee implements ICharQ {
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

        return q[getloc++]
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
            return (char) = 0;
        }

        return q[getloc++];
    }
}






public class IQDemo {
}
