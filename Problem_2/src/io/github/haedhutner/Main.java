package io.github.haedhutner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main ( String[] args ) {
        List<Integer> values = new ArrayList<>();
        values.add( 1 );
        values.add( 2 );

        int result = 0;

        for ( int i : getFibonacci( values, 4000000 ) ) {
            if ( i % 2 == 0 ) result += i;
        }

        System.out.println( result );

    }

    public static List<Integer> getFibonacci( List<Integer> values, int valueLimit ) {

        if ( values.size() < 2 ) {
            throw new IllegalArgumentException( "Must supply list of integers with at least 2 values already inserted in order to complete fibonacci sequence." );
        }

        int valueA = values.get( values.size() - 1 ); // last value
        int valueB = values.get( values.size() - 2 ); // second to last value

        int result = valueA + valueB;

        if ( result >= valueLimit ) return values;
        else {
            values.add( result );
            return getFibonacci( values, valueLimit );
        }
    }

}
