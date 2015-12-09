package edu.dlipinsky.homework4;

public class MyQueue {
    private int [] queue = new int [10];
    private int pointer = queue.length - 1;
    private int top = - 1;
    private int element;

    void pushEl (int element) {
        if (top < pointer) {
            queue[pointer] = element;
            pointer--;
        } else {
            System.out.println("The queue is full. Please pop some elements.");
        }
    }

    public int popEl () {
        element = queue[queue.length - 1];
        pointer++;
        moveRight();
        System.out.println("The element popped from the queue: " + element);
        return element;
    }

    private void moveRight () {
        int count = 0;
        for (int index = queue.length - 1; index >= 1; index--) {
            queue[index] = queue [index - 1];
            count++;
        }
        for (int index = 0; index < queue.length - count; index++) {
            queue[index] = 0;
        }
    }

    public void printQueue () {
        for (int index = 0; index < queue.length; index++) {
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
