package edu.dlipinsky.homework6;

import java.util.Iterator;

public class Node implements Iterator {

    private int value;
    private Node next;

    public Node(int value) {
        this.value =value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(Node node) {
        Node last = this;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(node);
    }

    public void removeLast() {
        Node last = this;
        while ((last.getNext() != null) && (last.getNext().getNext() != null)) {
            last = last.getNext();
        }
        last.setNext(null);
    }


    @Override
    public boolean hasNext() {
        Node node = this;
        if (node.getNext() != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Node next() {
        Node node = this;
        if (node.getNext() != null) {
            return node;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {

    }

}
