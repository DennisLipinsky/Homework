package edu.dlipinsky.homework2;

/**
 * Created by Δενθρ on 20.10.2015.
 */
public class YourOwnBinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 10;

    /* Your code here */

        // Bubble sort & printing the massive

        for ( int index = 0; index < array.length; index ++ ) {
            for ( int inIndex = index + 1; inIndex < array.length; inIndex ++ ) {
                if (array[index] > array[inIndex]) {
                    int maxEl = array[index];
                    array[index] = array [inIndex];
                    array[inIndex] = maxEl;
                }
            }
            System.out.print( array[index] + " " );
        }
        System.out.println();
        int elementInd = -1;

        //Searching the element's index

        if ( element <= array [array.length / 2] ) {
            if ( element == array [array.length / 2] ) {
                elementInd = array.length / 2;
            } else {
                int index = array.length / 2;
                while ( index > 0) {
                    if ( element == array [index] ) {
                        elementInd = index;
                    }
                    index = -- index;
                }
            }
        } else {
            int index = array.length / 2 + 1;
            while ( index < array.length ) {
                if ( element == array [index] ) {
                    elementInd = index;
                }
                index = ++ index;
            }
        }
        if ( elementInd > -1 ) {
            System.out.println( "The element's index is " + elementInd );
        } else {
            System.out.println( "The element was not found." );
            System.out.println( "The element's index is " + elementInd );
        }

    }
}
