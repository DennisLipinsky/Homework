package edu.dlipinsky.homework4;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.pushEl(12);
        q.pushEl(5);
        q.pushEl(2);
        q.printQueue();
        q.popEl();
        q.printQueue();
        q.pushEl(44);
        q.printQueue();
    }
}
