package io.github.haedhutner;

public class Main {

    public static void main ( String[] args ) {
        System.out.println( largestPalendromeBetween( 100, 999 ) );
    }

    public static int largestPalendromeBetween ( int start, int end ) {
        int largest = 0;
        for ( int i = start; i < end; i++ ) {
            for ( int j = start; j < end; j++ ) {
                int value = i * j;
                String stringValue = String.valueOf( value );

                if ( value > largest && stringValue.equals( reverseString( stringValue ) ) ) {
                    largest = value;
                }
            }
        }

        return largest;
    }

    public static String reverseString ( String string ) {
        return new StringBuffer( string ).reverse().toString();
    }

}
