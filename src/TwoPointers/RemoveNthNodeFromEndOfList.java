package TwoPointers;

//19. Remove Nth Node From End of List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class RemoveNthNodeFromEndOfList {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        int numToRemove = size - n;
        ListNode listNode = head;
        for (int i = 1; i <= numToRemove ; i++) {

            if(i == numToRemove){
                listNode = listNode.next.next;
            }
            listNode = listNode.next;
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

