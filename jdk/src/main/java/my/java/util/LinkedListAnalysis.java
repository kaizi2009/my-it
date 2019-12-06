package my.java.util;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author kaizi2009
 */
public class LinkedListAnalysis {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(2);
        linkedList.add(11);
        linkedList.sort(null);
        linkedList.remove(2);
        Object[] objects = linkedList.toArray();
        System.out.println(objects);

    }

    /**
     * 测试单向链表
     */
    public static void testNode() {
        MyLinkedList linkedList = new MyLinkedList().add(1).add(2).add(6).add(3).add(4).add(5).add(6);
        Node head = linkedList.getFirst();

    }

    /**
     * 删除并排序
     * @param head
     * @param val
     * @return
     */
    public static Node removeAndSort(Node head, int val) {
        Node result;
        for (Node x = head; x != null; x = x.next) {
            if (x.val == val) {

            }
        }
        return null;
    }

    static class MyLinkedList {
        private Node first;
        private Node last;
        MyLinkedList add(int val) {
            final Node l = last;
            final Node newNode = new Node(val);
            last = newNode;
            if (l == null) {
                first = newNode;
            } else {
                l.next = newNode;
            }
            return this;
        }

        Node getFirst() {
            return first;
        }
    }

    /**
     * 单向链表
     */
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
