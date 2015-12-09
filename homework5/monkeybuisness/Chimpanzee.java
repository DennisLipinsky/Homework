package edu.dlipinsky.homework5.monkeybuisness;

import java.util.Random;

public class Chimpanzee implements Monkey {

    private Random random = new Random();
    private boolean boom = false;

    public Chimpanzee() {}

    public void eat() throws ChimpanzeeEatException {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new ChimpanzeeEatException(decision);
        }
        System.out.println("Chimpanzee ate up a banana instead of grenade!");
    }

    public void wakeUp() throws MonkeyWakeUpException {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new MonkeyWakeUpException(decision);
        }
        System.out.println("Chimpanzee waked up without Boom!");

    }

    public void doMonkeyBusiness() {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            boom = true;
            throw new MonkeyBoomException(decision);
        }
        System.out.println("Good luck! Chimpanzee acts something safe");

    }

    @Override
    public void close() {
        if (boom) {
            System.out.println("We're closing. Chimpanzee has blew up a grenade!");
        }
    }
}
