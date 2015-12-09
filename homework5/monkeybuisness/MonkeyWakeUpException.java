package edu.dlipinsky.homework5.monkeybuisness;

public class MonkeyWakeUpException extends RuntimeException {

    public MonkeyWakeUpException(Double reason) {
        System.out.println("Reason is " + reason + ". Bad luck.");
        System.out.println("It will never wake up.");
    }
}