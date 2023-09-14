//class LL {
//
//    Node head;
//    private int size;
//
//    LL(){
//        this.size = 0;
//    }
//
//    class Node{
//        String data;
//        Node next;
//        // Constructor
//        Node(String data){
//            this.data = data;
//            this.next = null;
//            size++;
//        }
//    }
//    // add - first, last
//    public void addFirst(String data) {
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//    // add - Last
//    public void addLast(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        Node currNode = head;
//        while (currNode.next != null){
//            currNode = currNode.next;
//        }
//        currNode.next = newNode;
//    }
//    // print
//    public void printList(){
//        if(head == null){
//            System.out.println("List is empty!");
//            return;
//        }
//        Node currNode = head;
//        while (currNode != null){
//            System.out.print(currNode.data + " -> ");
//            currNode = currNode.next;
//        }
//        System.out.println("NULL");
//    }
//    //deleteFirst
//    public void deleteFirst(){
//        if(head == null){
//            System.out.println("List is Empty");
//            return;
//        }
//        size--;
//        head = head.next;
//    }
//
//    // deleteLast
//    public void deleteLast(){
//        if(head != null){
//            System.out.println("List is Empty");
//            return;
//        }
//        size--;
//        if(head.next == null){
//            head=null;
//            return;
//        }
//
//        Node secondLast = head;
//        Node lastNode = head.next;
//        while(lastNode.next != null){
//            lastNode = lastNode.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next =null;
//    }
//
//    // Size
//    public int getSize(){
//        return size;
//    }
//
//    // ReverseIterate   space complexity O(1)
//    public void reverseIterate(){
//
//        if(head==null || head.next == null){
//            return;
//        }
//        Node prevNode = head;
//        Node currNode = head.next;
//        while(currNode != null){
//            Node nextNode = currNode.next;
//            currNode.next =prevNode;
//
//            // update
//            prevNode = currNode;
//            currNode = nextNode;
//        }
//        head.next = null;
//        head= prevNode;
//    }
//
//    // ReverseRecursive
//    public Node reverseRecursive(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        Node newHead = reverseRecursive(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//
//    public static void main(String args[]){
//        LL list = new LL();
//        list.addFirst("is");
//        list.addFirst("a");
//        list.printList();
//        list.addLast("list");
//        list.addFirst("This");
//        list.printList();
//        list.deleteFirst();
//        list.printList();
//        System.out.println(list.getSize());
//
//        LL list2 = new LL();
//        list2.addLast("1");
//        list2.addLast("2");
//        list2.addLast("3");
//        list2.addLast("4");
//        list2.printList();
//        list2.reverseIterate();
//        list2.printList();
//
//        list2.head = list2.reverseRecursive(list2.head);
//        list2.printList();
//    }
//}
