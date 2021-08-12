package WorkingNumbers;

import java.util.*;

public class Main {

    public List<Integer> evenNumber ( List<Integer> inputList ) {
        List<Integer> sortedList = new ArrayList<> ( );
        for (Integer integer : inputList) {
            if ( integer > 0 ) {
                if ( integer % 2 == 0 ) {
                    sortedList.add ( integer );
                }
            }
        }
        return sortedList;
    }

    public List<Integer> sort ( List<Integer> list ) {
        int number = 0;
        boolean sorted = false;
        while ( !sorted ) {
            sorted = true;
            for (int i = 1; i < list.size ( ); i++) {
                if ( list.get ( i - 1 ) > list.get ( i ) ) {
                    number = list.get ( i - 1 );
                    list.set ( i - 1 , list.get ( i ) );
                    list.set ( i , number );
                    sorted = false;
                }
            }
        }
        return list;
    }

    public static void main ( String[] args ) {
        List<Integer> list = Arrays.asList ( 1 , 2 , 5 , 16 , -1 , -2 , 0 , 32 , 3 , 5 , 8 , 23 , 4 );

        Main sortNumber = new Main ( );

        List<Integer> sortedList = sortNumber.evenNumber ( list );
        List<Integer> straightSortList = sortNumber.sort ( sortedList );
        System.out.println ( straightSortList );

    }
}