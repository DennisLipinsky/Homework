package edu.dlipinsky.Homework3;

public class FibonacciNumb {
    public static void main(String[] args) {

        int n = 10;
        int currentNumb = 0;
        int nextNumb = 1;
        int sum = 0;

        System.out.println("Here is the Fibonacci row up to 10th element");
        System.out.print(currentNumb + ", ");
        for (int i = 1; i <= n; i++) {
            sum = currentNumb + nextNumb;
            System.out.print(sum + ", ");
            currentNumb = nextNumb;
            nextNumb = sum;
        }
    }
}
