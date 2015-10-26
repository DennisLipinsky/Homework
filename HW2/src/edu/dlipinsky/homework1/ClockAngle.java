package edu.dlipinsky.homework1;

public class ClockAngle {
    public static void main(String[] args) {
        int hours =  27;
        int mins = 430;
        float result = 0;

        /*Your code here*/

        if ( hours >= 0 && hours < 12 && mins >= 0 && mins < 60 ) {
            int hourAngle = hours * 30;
            int minAngle = mins * 6;
            if ( hourAngle >= minAngle ){
                result = hourAngle - minAngle;
                if (result > 180){
                    result = 360 - result;
                }
                System.out.println(" The angle between hour and minute hand is " + result);
            } else {
                result = minAngle - hourAngle;
                if (result > 180){
                    result = 360 - result;
                }
                System.out.println(" The angle between hour and minute hand is " + result);
            }
        } else {
            System.out.println("Error! Input numbers entering boundary values.");
        }

    }
}
