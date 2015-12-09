package edu.dlipinsky.homework5.monkeybuisness;

import java.util.Random;

public class Gorilla implements Monkey {

    private Random random = new Random();
    private boolean boom = false;

    public Gorilla() {}

    public void fight() {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new GorillaFightException(decision);
        }
        System.out.println("Gorilla ate up without Boom!");
    }

    public void wakeUp() {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new MonkeyWakeUpException(decision);
        }
        System.out.println("Gorilla waked up without Boom!");

    }

    public void doMonkeyBusiness() {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new MonkeyBoomException(decision);
        }
        System.out.println("Good luck! Gorilla acts something safe");

    }

    @Override
    public void close() {
        if (boom) {
            System.out.println("We're closing. Gorilla is dead");
        }
    }
}



