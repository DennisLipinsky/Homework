package edu.dlipinsky.Homework3;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Node {
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

    public void print(Node head) {
        if (head.getNext() != null) {
            System.out.print(head.getValue() + " --> ");
        } else {
            System.out.print(head.getValue() + " --> NULL");
            System.out.println();
        }
        if (head.getNext() != null) {
            print(head.getNext());
        }
        //System.out.println();  this line makes some mess
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     */
    public void remove(int position) {
        /*Your code here*/
        // Numeration is starting from 1
        // Here you can remove any node, except the first & the last
        Node thiz = this;
        int currentPosition = 1;
        int listSize = 1;
        while (thiz.getNext() != null) {
            thiz = thiz.getNext();
            ++listSize;
        }
        if ((position > listSize) && ( position <= 0)) {
            System.out.println("Error! The Node position is out of list.");
        } else {
            if ((position == 1) || (position == listSize)) {
                System.out.println("Error! You can't remove the first and the last Node.");
            } else {
                thiz = this;
                while ((currentPosition < position) || (thiz.getNext() != null)) {
                    if ((currentPosition + 1 ) == position) {
                        thiz.setNext(thiz.getNext().getNext());
                        System.out.println("The Node #" + position + " deleted.");
                    }
                    ++currentPosition;
                    thiz = thiz.getNext();
                }
            }
        }
    }



    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     */
    public void addNode(int position, Node node) {
        /*Your code here*/

        Node thiz = this;
        Node that = this;
        int currentPosition = 1;
        int listSize = 1;

        while (thiz.getNext() != null) {
            thiz = thiz.getNext();
            ++listSize;
        }
        if ((position > listSize) && ( position <= 0)) {
            System.out.println("Error! The Node position is out of list.");
        } else {
            if (position == 1) {
                System.out.println("Error! You can't add Node on the first position.");
            } else {
                thiz = this;
                while ((currentPosition < position) || (thiz.getNext() != null)) {
                    if ((currentPosition + 1 ) == position) {
                        that = thiz.getNext();
                        thiz.setNext(node);
                        node.setNext(that);
                        System.out.println("The Node on position " + position + " added.");
                    }
                    ++currentPosition;
                    thiz = thiz.getNext();
                }
            }
        }
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public Node getFromTail(int position) {
        /*Your code here and please remove "return null". I've put it for ability to compile code*/

        Node thiz = this;
        int currentPosition = 1;
        int listSize = 1;
        while (thiz.getNext() != null) {
            thiz = thiz.getNext();
            ++listSize;
        }
        if ((position > listSize) && ( position <= 0)) {
            System.out.println("Error! The Node position is out of list.");
        } else {
            if (position == listSize) {
                System.out.println("Here is the " + position + " Node: " + this.value);
                return this;
            } else {
                thiz = this;
                currentPosition = listSize - position + 1;
                for (int index = 1; index < currentPosition; index++) {
                    thiz = thiz.getNext();
                }
            }
        }
        System.out.println("Here is the " + position + " Node from the tail: " + thiz.value);
        return thiz;
    }
}
