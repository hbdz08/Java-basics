package com.lau.javabasics.java.basics.dataStructure;

public class Node {

    /**
     * 数据域
     */
    public Object data;
    /**
     * 指针域，指向下一个节点
     */
    public Node next;
    /**
     * 指针域， 指向上一个节点
     */
    public Node prev;


    public Node(Object data) {
        this.data = data;
    }
}
