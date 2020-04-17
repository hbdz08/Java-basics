package com.lau.javabasics.java.basics.dataStructure;

import java.io.File;
import java.util.Collections;

/**
 * @author lau
 */
public class SingleLinkedList {

    public Node head;

    public int size;

    public void addHead(Object data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;

        size++;

    }

    public void push(Object data) {
        addHead(data);
    }

    public void pop() {
        deleteHead();
    }

    public void deleteHead() {
        head = head.next;
        size--;
    }

    public void delete(Object data) {
        if (size > 0) {
            Node current = head;
            Node previous = head;
            while (current.data != data) {
                if (current.next == null) {
                    return;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
            if (current == head) {
                head = current.next;
            } else {
                previous.next = current.next;

            }
            size--;
        }
    }


    public Object get(Object data) {
        if (size > 0) {
            int tempSize = size;
            Node node = head;
            if (head.data == data) {
                return head.data;
            }
            while (tempSize > 0) {
                if (node.next != null) {
                    if (node.next.data == data) {
                        return node.next.data;
                    }
                    node = node.next;
                }
                tempSize--;
            }

        }
        return null;
    }

    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            System.out.println(head.data);
            while (tempSize > 0) {
                if (node.next != null) {
                    System.out.println(node.next.data);
                    node = node.next;
                }
                tempSize--;
            }
        } else {
            System.out.println("[]");
        }
    }



    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead(23);
        singleLinkedList.addHead(22);
        singleLinkedList.addHead(33);
//            singleLinkedList.deleteHead();
        singleLinkedList.delete(22);
        singleLinkedList.display();

        System.out.println(singleLinkedList.get(11));

    }

}
