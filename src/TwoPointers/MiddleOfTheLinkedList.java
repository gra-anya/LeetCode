package TwoPointers;
//876. Middle of the Linked List
//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int size = size(head);
        int middle = size % 2 == 0 ? size / 2 : (size / 2) + 1;
        for (int i = 0; i < middle; i++) {
            head = head.next;
        }
        return head;
    }

    public static int size(ListNode listNode) {
        int size = 0;
        while (listNode.next != null) {
            size++;
            listNode = listNode.next;
        }
        return size;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
