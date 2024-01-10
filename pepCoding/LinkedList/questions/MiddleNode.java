package pepCoding.LinkedList.questions;

public class MiddleNode {

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
        System.out.println(middleNode(head));
    }

    public static int middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next.next == null){
            slow = slow.next;
        }
        return slow.val;

    }
}
