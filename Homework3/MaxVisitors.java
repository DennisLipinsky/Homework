package edu.dlipinsky.Homework3;

public class MaxVisitors {
    public static void main(String[] args) {
        boolean[] visitors = {true, true, true, true, true, true, false, true, false, false, true, false, false, false,
                false, false};
        int current = 0;
        int maxVisits = 0;
        if (visitors.length != 0) {
            for (boolean enter:visitors ) {
                if (enter) {
                    current++;
                } else {
                    current--;
                }
                if (current > maxVisits) {
                    maxVisits = current;
                }
            }
            if (current == 0) {
                System.out.println ("The maximum number of visitors is " + maxVisits);
            } else {
                System.out.println ("Error! The number of enters does not equal to the number of exits.");
            }
        } else {
            System.out.println ("There were not visitors today.");
        }
    }
}
