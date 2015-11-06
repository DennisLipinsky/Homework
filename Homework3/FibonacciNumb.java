package edu.dlipinsky.Homework3;

public class FibonacciNumb {
    public static void main(String[] args) {

        int n = 20;
        int currentNumb = 0;
        int nextNumb = 1;
        int sum = 0;

        System.out.println("Here is the Fibonacci row up to " + n + " element:");
        for (int i = 1; i <= n; i++) {
            System.out.print(sum + " ");
            sum = currentNumb + nextNumb;
            currentNumb = nextNumb;
            nextNumb = sum;
        }
    }
}
