package edu.dlipinsky.homework5.monkeybuisness;

public class MonkeyTest {
    public static void main(String[] args) {
        try (Chimpanzee chimp = new Chimpanzee())
        {
            chimp.wakeUp();
            chimp.doMonkeyBusiness();
            chimp.eat();
        } catch (MonkeyWakeUpException  | MonkeyBoomException | ChimpanzeeEatException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println();
        try (Gorilla guerilla = new Gorilla())
        {
            guerilla.wakeUp();
            guerilla.doMonkeyBusiness();
            guerilla.fight();
        } catch (MonkeyWakeUpException  | MonkeyBoomException | GorillaFightException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}