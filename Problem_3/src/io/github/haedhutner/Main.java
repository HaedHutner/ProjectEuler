package io.github.haedhutner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main ( String[] args ) {
        long before = System.currentTimeMillis();
        System.out.println( getPrimeFactors( 600851475143L ) );

        long after = System.currentTimeMillis();
        System.out.println( after - before );

    }

    public static List<Integer> getPrimeFactors( long value ) {
        List<Integer> factors = new ArrayList<>();

        double max = Math.sqrt( value );
        for ( int i = 1; i < max; i++ ) {
            if ( value % i == 0 && isPrime( i ) ) factors.add( i );
        }

        return factors;
    }

    public static boolean isPrime( int value ) {
        double max = Math.sqrt( value );
        for ( int i = 2; i < max; i++ ) {
            if ( value % i == 0 ) return false;
        }
        return true;
    }

}
