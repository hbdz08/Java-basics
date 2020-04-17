package com.lau.javabasics.java.basics.dataStructure;

/**
 * @author lau
 */
public class DoublePointLinkedList {
    //头节点
    private Node head;
    //尾节点
    private Node tail;

    private int size;

    public DoublePointLinkedList() {
    }

    public void addHead(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            head.prev = n;
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addTail(Object data) {
        Node n = new Node(data);
        if (tail == null) {
            head = n;
        } else {
            n.prev = tail;
            tail.next = n;
        }
        tail = n;
        size++;

    }

    public void deleteHead() {
        if (size > 0) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;

        }
    }

    public void deleteTail() {
        if (size > 0) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    //显示节点信息
    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {//当前链表只有一个节点
                System.out.println("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        } else {//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }
    }

    public static void main(String[] args) {
        DoublePointLinkedList d = new DoublePointLinkedList();
        d.addHead("a");
        d.addHead("b");
        d.addTail("c");
        d.addTail("e");
//     d.deleteHead();
        d.deleteTail();
        d.display();
    }
}

