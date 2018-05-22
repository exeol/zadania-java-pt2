class errorMsg {

    final int OUTERR    = 0;
    final int INNER     = 1;
    final int DISKERR   = 2;
    final int INDEXERR  = 3;

    String msgs[] = {"Błąd wyjścia", "Błąd wejścia", "Dysk pełny", "Indesk spoza zakresu"};

    String getErrorMsg(int i) {
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Niepoprawny kod błędu";
    }
}



public class finalD {
    public static void main(String arg[]) {
        errorMsg err = new errorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
