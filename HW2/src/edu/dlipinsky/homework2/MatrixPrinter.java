package edu.dlipinsky.homework2;

/**
 * Created by ����� on 20.10.2015.
 */
public class MatrixPrinter {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };
    /* Your code here */

        int index = 0;
        while ( index < array.length ) {
            int inIndex = 0;
            while ( inIndex < array[index].length ) {
                System.out.print( array [index][inIndex] + " " );
                inIndex = ++ inIndex;
            }
            System.out.println();
            index = ++ index;
        }

    }

}
