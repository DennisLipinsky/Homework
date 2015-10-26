package edu.dlipinsky.homework2;

public class MatrixInverter {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {7, 5, 4, 1}
        };
    /* Your code here */

    /*
     * Main diagonal invertion
     */
        for ( int index = 0; index < array.length; index++ ) {
            for ( int inIndex = index + 1; inIndex < array[index].length; inIndex++ ) {
                int temp = array [index][inIndex];
                array [index][inIndex] = array[inIndex][index];
                array [inIndex][index] = temp;
            }
        }

        // Matrix output
        System.out.println( "The matrix inverted by main diagonal: " );
        int ind = 0;
        while ( ind < array.length ) {
            int inIndex = 0;
            while ( inIndex < array[ind].length ) {
                System.out.print( array [ind][inIndex] + " " );
                ++inIndex;
            }
            System.out.println();
            ++ind;
        }

        /*
         *  Additional diagonal invertion
         */

        for ( int index = array.length - 1; index >= 0; index-- ) {
            int rowPointer = index - 1;
            int colPointer = array.length - index - 1;
            for ( int inIndex = array.length - index; inIndex < array[index].length; inIndex++ ) {
                int temp = array [index][inIndex];
                array [index][inIndex] = array[rowPointer][colPointer];
                array [rowPointer][colPointer] = temp;
                --rowPointer;
            }
        }
        System.out.println();
        System.out.println( "The matrix inverted by additional diagonal: " );

        // Matrix output
        ind = 0;
        while ( ind < array.length ) {
            int inIndex = 0;
            while ( inIndex < array[ind].length ) {
                System.out.print( array [ind][inIndex] + " " );
                ++inIndex;
            }
            System.out.println();
            ++ind;
        }
    }
}
