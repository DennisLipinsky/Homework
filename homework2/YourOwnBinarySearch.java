package edu.dlipinsky.homework2;

public class YourOwnBinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 10;

        /* Your code here */

        // Check if array isn't empty
        if (array.length != 0) {

            // Bubble sort & printing the massive

            for ( int index = 0; index < array.length; index++ ) {
                for ( int inIndex = index + 1; inIndex < array.length; inIndex++ ) {
                    if (array[index] > array[inIndex]) {
                        int maxEl = array[index];
                        array[index] = array [inIndex];
                        array[inIndex] = maxEl;
                    }
                }
                System.out.print( array[index] + " " );
            }
            System.out.println();

            // binary search

            int minElement = 0;
            int maxElement = array.length - 1;
            int elementInd = array.length / 2;
            while((minElement <= maxElement) && (array[elementInd] != element)) {
                if (array[elementInd] < element) {
                    minElement = elementInd + 1;
                } else {
                    maxElement = elementInd - 1;
                }
                elementInd = (minElement + maxElement) / 2;
            }
            if (minElement <= maxElement) {
                System.out.println("The element's index is " + elementInd);
            } else {
                System.out.println("Error! The element " + element + " was not found.");
            }
        } else {
            System.out.println("Error! The array is empty.");
        }
    }
}