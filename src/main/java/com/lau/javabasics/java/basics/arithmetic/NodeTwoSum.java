package com.lau.javabasics.java.basics.arithmetic;

public class NodeTwoSum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        ListNode l3 = new ListNode(0);
        ListNode cur = l3;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int value = x + y + a;
            a = value / 10;
            value = value % 10;
            cur.next = new ListNode(value);
            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (a == 1) {
                cur.next = new ListNode(1);
            }

        }


        return l3.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);

        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        l1.next = listNode1;
        l1.next.next = listNode2;

        ListNode l2 = new ListNode(3);

        l2.next = new ListNode(5);

        l2.next.next = new ListNode(7);


        ListNode listNode = addTwoNumbers(l1, l2);
        ListNode cur = listNode;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }


    }
}
