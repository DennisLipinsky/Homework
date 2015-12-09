package edu.dlipinsky.homework5.monkeybuisness;

public class ChimpanzeeEatException extends RuntimeException {
    public ChimpanzeeEatException(double reason) {
        System.out.println("Chimpanzee is down!");
        System.out.println("Reason is " + reason + ". Bad luck, you got a grenade instead of banana!");
    }
}
