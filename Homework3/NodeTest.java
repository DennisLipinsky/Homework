package edu.dlipinsky.Homework3;


public class NodeTest {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.add(new Node(4));
        head.add(new Node(5));
        head.add(new Node(6));
        head.add(new Node(7));


        head.print(head);
        head.addNode(4, new Node(100));
        head.print(head);
        head.remove(4);
        head.print(head);
        head.getFromTail(4);
        head.print(head);

        /*head.removeLast();
        head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();*/
    }

}