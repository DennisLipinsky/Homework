package edu.dlipinsky.Homework3;

public class FibonacciNumRecurs {
    public static void main(String[] args) {
        int numbers = 10;
        System.out.println("Here is the Fibonacci row up to " + numbers + " element:");
        fiboNumb(numbers, 0, 1);
    }

    private static void fiboNumb (int numbers, int currentNumb, int sum) {
        System.out.print(currentNumb + " ");
        int nextNumb = sum;
        sum = currentNumb + nextNumb;
        currentNumb = nextNumb;
        if (numbers - 1 > 0) {
            fiboNumb(numbers - 1, currentNumb, sum);
        }
    }
}
