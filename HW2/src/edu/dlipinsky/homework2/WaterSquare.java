package edu.dlipinsky.homework2;

/**
 * Created by Δενθρ on 20.10.2015.
 */
public class WaterSquare {
    public static void main(String[] args) {
        int[] array = { 7, 5, 6, 3, 8 };

        int waterSquare = 0;
        int firstShore = array [0];
        int opposShore = array [0];
        int firstShoreInd = 0;
        int opposShoreInd = 0;
        boolean noWater = false;

        // Searching the first & the opposite shores and their indexes

        for ( int i = 0; i < array.length; i++ ) {
            if ( array [i] > firstShore ) {
                firstShore = array [i];
                firstShoreInd = i;
            }
        }
        for ( int j = 0; j < array.length; j++ ) {
            if ( array [j] > opposShore && array [j] < firstShore ) {
                opposShore = array [j];
                opposShoreInd = j;
            }
            if ( firstShore == opposShore && firstShoreInd == opposShoreInd && j <= array.length - 1) {
                opposShore = array [j+1];
                opposShoreInd = j+1;
            }
        }

        if ( firstShoreInd > opposShoreInd) {
            int temp = firstShoreInd;
            firstShoreInd = opposShoreInd;
            opposShoreInd = temp;
            temp = firstShore;
            firstShore = opposShore;
            opposShore = temp;
        }

        if (firstShoreInd > opposShoreInd) {
            if ( firstShoreInd - opposShoreInd == 1 ) {
                System.out.println( "Watersquare is " + waterSquare);
                noWater = true;
            }
        } else {
            if ( opposShoreInd - firstShoreInd == 1 ) {
                System.out.println( "Watersquare is " + waterSquare);
                noWater = true;
            }
        }
        System.out.println("First shore is " + firstShore);
        System.out.println("First shore index is " + firstShoreInd);
        System.out.println("Opposite shore is " + opposShore);
        System.out.println("Opposite shore index is " + opposShoreInd);

        // Calculating the watersquare

        int shoreInd = 0;
        if ( array[shoreInd] > array[shoreInd + 1] ) {
            boolean waterIn = false;
            int nextInd = shoreInd;
            int maxEl = array [shoreInd];
            int maxElInd = shoreInd;
            while ( !waterIn || nextInd < array.length) {
                nextInd = ++ nextInd;
                if ( array [shoreInd] >= array [nextInd] ) {
                    waterSquare = waterSquare + (array[shoreInd] - array[nextInd]);
                } else {
                    waterIn = true;
                }
                if (maxEl <= array [nextInd]) {
                    maxEl = array [nextInd];
                    maxElInd = nextInd;
                    if (maxEl == array[shoreInd] && maxElInd == shoreInd ) {
                        waterSquare = 0;
                    }
                }
                if (noWater) {
                    waterSquare = 0;
                }

                System.out.println("WaterSquare is " + waterSquare);
            }
        }
    }
}
