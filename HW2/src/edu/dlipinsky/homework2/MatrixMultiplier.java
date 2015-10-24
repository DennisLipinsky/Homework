package edu.dlipinsky.homework2;

public class MatrixMultiplier {

    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };

        // Init result matrix
        int [][] result = new int[3][3];

        /*
         * Your code is here
         */

        if ( first[0].length == second.length ) {

            for ( int indResult = 0; indResult < result.length; indResult++ ) {
                for ( int index = 0; index < first.length; index++ ) {
                    int temp = 0;
                    for ( int innerIndex = 0; innerIndex < second.length; innerIndex++ ) {
                        temp = temp + first[indResult][innerIndex] * second[innerIndex][index];
                    }
                    result[indResult][index] = temp;
                }
            }

        } else {
            System.out.println( "Matrixes are not multipliable!" );
        }

        int index = 0;
        while ( index < result.length ) {
            int inIndex = 0;
            while ( inIndex < result[index].length ) {
                System.out.print( result [index][inIndex] + " " );
                ++inIndex;
            }
            System.out.println();
            ++index;
        }
    }
}
