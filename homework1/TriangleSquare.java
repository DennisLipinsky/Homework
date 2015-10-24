package edu.dlipinsky.homework1;

public class TriangleSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        double square = 0;

        /*your code here*/
        // Calculating the distance between the orthogonal coordinates
        int x1x2 = x2 - x1;
        int y1y2 = y2 - y1;
        // Calculating the triangle side
        double a = Math.sqrt (x1x2 * x1x2 + y1y2 * y1y2);
        x1x2 = x3 - x2;
        y1y2 = y3 - y2;
        double b = Math.sqrt (x1x2 * x1x2 + y1y2 * y1y2);
        x1x2 = x1 - x3;
        y1y2 = y1 - y3;
        double c = Math.sqrt (x1x2 * x1x2 + y1y2 * y1y2);
        // Calculating the perimeter
        length = a + b + c;
        // Calculating the triangle area using the formula of Heron
        square = Math.sqrt ( (length / 2) * (length / 2 - a) * (length / 2 - b) * (length / 2 - c));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }

}
