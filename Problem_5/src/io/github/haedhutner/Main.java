package io.github.haedhutner;

public class Main {

    public static void main ( String[] args ) {
        System.out.println( getSmallestDivisibleBy( new long[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        }, 2L ) );
    }

    // This would work, if it didn't overflow the stack
    /*public static long getSmallestDivisibleBy ( long[] factors, long startingValue ) {
        for ( long j : factors ) {
            if ( startingValue % j != 0 ) return getSmallestDivisibleBy( factors, startingValue + 1 );
        }

        return startingValue;
    }*/

    public static long getSmallestDivisibleBy ( long[] factors, long startingValue ) {
        long result = -1;

        long value = startingValue;

        mainLoop:
        while ( result == -1 ) {
            for ( long j : factors ) {
                if ( value % j != 0 ) {
                    value++;
                    continue mainLoop;
                }
            }

            result = value;
        }

        return value;
    }

}
