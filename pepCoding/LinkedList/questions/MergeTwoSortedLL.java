package pepCoding.LinkedList.questions;

public class MergeTwoSortedLL {

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

        ListNode L1head3 = new ListNode(4,null);
        ListNode L1head2 = new ListNode(3,L1head3);
        ListNode L1head1 = new ListNode(2,L1head2);
        ListNode L1head = new ListNode(1,L1head1);
        System.out.println(MergeSortedLL(head, L1head));
    }

    private static ListNode MergeSortedLL(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode currNode = res;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                currNode.next = l2;
                l2 = l2.next;
            }else{
                currNode.next = l1;
                l1 = l1.next;
            }

            currNode = currNode.next;
        }

        while(l1 != null){
            currNode.next = l1;
            l1 = l1.next;
            currNode = currNode.next;
        }
        while(l2 != null){
            currNode.next = l2;
            l2 = l2.next;
            currNode = currNode.next;
        }

        return res.next;
    }
}
