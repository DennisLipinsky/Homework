package edu.dlipinsky.homework2;

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

        for ( int index = 0; index < array.length; index++ ) {
            if ( array[index] > firstShore ) {
                firstShore = array [index];
                firstShoreInd = index;
            }
        }
        for ( int index = 0; index < array.length; index++ ) {
            if ( array[index] > opposShore && array[index] < firstShore ) {
                opposShore = array[index];
                opposShoreInd = index;
            }
            if ( firstShore == opposShore && firstShoreInd == opposShoreInd && index <= array.length - 1) {
                opposShore = array[index + 1];
                opposShoreInd = index + 1;
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
            while ( !waterIn || (nextInd < array.length - 1)) {
                ++nextInd;
                if ( array[shoreInd] >= array [nextInd] ) {
                    waterSquare = waterSquare + (array[shoreInd] - array[nextInd]);
                } else {
                    waterIn = true;
                }
                if (maxEl <= array[nextInd]) {
                    maxEl = array[nextInd];
                    maxElInd = nextInd;
                    if (maxEl == array[shoreInd] && maxElInd == shoreInd ) {
                        waterSquare = 0;
                    }
                }
                if (noWater) {
                    waterSquare = 0;
                }
            }
            System.out.println("WaterSquare is " + waterSquare);
        }
    }
}
