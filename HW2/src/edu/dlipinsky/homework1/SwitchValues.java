package edu.dlipinsky.homework1;

public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;

        // Way 1 - add, sub
        first = first + second;
        second = first - second;
        first = first - second;

        // Way 2 - multiplying, division
        /*first = first * second;
        second = first / second;
        first = first / second;*/
        // Way 2 is not acceptable, because, first of all, both variables are need to be check on  inequality to zero,
        // second is by hardware multiply & division operations are more resource-intensive, and in the end they
        // reduce to add operations

        /*int temp = first;
        first = second;
        second = temp;*/

        System.out.println("First = " + first + " , second = " + second);

    }
}
