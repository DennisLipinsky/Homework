package edu.dlipinsky.homework6;

import java.util.*;

public class LinkedListNodeTest {

    public static void printNodeList(LinkedList<Node> myNodeList) {
        ListIterator<Node> myIterator = myNodeList.listIterator();
        System.out.println("Here is the list of Nodes: ");
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " --> ");
        }
        System.out.println();
        System.out.println();
    }

    public static Node getFromTail (LinkedList<Node> myNodeList, int position) {
        Node node = null;
        if (position > myNodeList.size()) {
            System.out.println("Error! The Node position is out of list.");
        } else if (position == 0) {
            System.out.println("Error! The Node position should be bigger than 0.");
        } else {
            int currentPosition = myNodeList.size() - position;
            node = myNodeList.get(currentPosition);
            System.out.println("Here is the Node taken on " + position + " position from the tail:");
        }
        return node;
    }

    public static void main(String[] args) {

        LinkedList<Node> nodeList = new LinkedList<Node>();

        nodeList.add(new Node(3));
        nodeList.add(new Node(4));
        nodeList.add(new Node(5));
        nodeList.add(new Node(6));
        nodeList.add(new Node(7));
        printNodeList(nodeList);

        nodeList.add(4, new Node(100));
        printNodeList(nodeList);

        nodeList.remove(5);
        printNodeList(nodeList);

        System.out.println(getFromTail(nodeList, 0));

    }
}
