package edu.dlipinsky.homework5.monkeybuisness;

public class GorillaFightException extends RuntimeException {
        public GorillaFightException(double reason) {
            System.out.println("Gorilla is down!");
            System.out.println("Reason is " + reason + ". Bad luck, somebody knocked it down!");
        }
}
