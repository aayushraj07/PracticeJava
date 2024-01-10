package pepCoding.LinkedList.questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class RotateLL {

private static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head3 = new ListNode(4,null);
        ListNode head2 = new ListNode(3,head3);
        ListNode head1 = new ListNode(2,head2);
        ListNode head = new ListNode(1,head1);
        System.out.println(rotateRight(head,1));
    }

    private static ListNode rotateRight(ListNode head, int k) {

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for(int i =1; i < size-k; i++){
            temp = temp.next;
        }

        ListNode new1 = temp.next;
        temp.next = null;

        ListNode temp1 = new1;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = head;
        head = new1;

        return head;

    }

}
