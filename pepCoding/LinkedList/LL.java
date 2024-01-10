//package pepCoding.LinkedList;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class LL {
//    private Node head;
//    private Node tail;
//    private int size;
//    public LL(){
//        this.size = 0;
//    }
//    public void insertFirst(int value){
//        Node node = new Node(value);
//        node.next = head;
//        head = node;
//        if(tail == null){
//            tail = head;
//        }
//        size+=1;
//    }
//
//    public void display(){
//        Node temp = head;
//        while(temp!= null){
//            System.out.print(temp.value + " -> ");
//            temp =temp.next;
//        }
//        System.out.println("END");
//    }
//
////Time complexit is Constant
//    public void insertLast(int value){
//        if(tail == null){
//            insertFirst(value);
//            return;
//        }
//        Node node = new Node(value);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//
//    public void insert(int value, int index){
////        4,3,2,4,32
////        Node n = new Node(value);
////        Node temp = head;
////        for(int i=0; i < index; i++){
////            temp = temp.next;
////        }
//
//
//        if(index == 0){
//            insertFirst(value);
//            return;
//        }
//        if(index == size){
//            insertLast(value);
//            return;
//        }
//
//        Node temp = head;
//        for(int i = 1; i< index; i++){
//            temp = temp.next;
//        }
//
//        Node node = new Node(value, temp.next);
//        temp.next = node;
//    }
//
//
//    public void removeLast(){
//        Node node = head;
//        if(size == 0){
//            System.out.println("List is empty!");
//        }else if(size == 1){
//            head = tail = null;
//            size = 0;
//        } else{
//            Node temp = head;
//            for (int i =0; i< size-2; i++){
//                temp = temp.next;
//            }
//            tail = temp;
//            temp.next = null;
//            size--;
//        }
//
////        while(node.next.next != null){
////            node = node.next;
////        }
////        node.next = null;
//    }
//
//    public void removeFirst(){
//        Node node = head;
//        if(node.next != null){
//            head = head.next;
//        }else{
//            head = null;
//        }
//    }
//
//    public void revereseLL(){
//        Node temp = head;
//        Stack<Integer> values = new Stack<>();
//
//        while(temp != null){
//            values.push(temp.value);
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp != null){
//            temp.value = values.pop();
//            temp = temp.next;
//        }
//    }
//
//    private Node getNodeAt(int idx){
//        Node temp = head;
//        for (int i =0; i< idx; i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
//    public void reverseLLSwap(){
//        int li = 0;
//        int ri = size -1;
//
//        while(li < ri){
//            Node left = getNodeAt(li);
//            Node right = getNodeAt(ri);
//
//            int temp = left.value;
//            left.value = right.value;
//            right.value = temp;
//
//            li++;
//            ri--;
//        }
//    }
//
//    public void reverseNextPointer(){
//        Node curr = head;
//        Node prev = null;
//
//        while(curr != null){
//            Node next = curr.next;
//
//            curr.next = prev;
//
//            prev = curr;
//            curr = next;
//        }
//        Node temp = head;
//        head = tail;
//        tail = temp;
//    }
//
//    public void removeAt(int idx) {
//        if (idx < 0 || idx >= size) {
//            System.out.println("Invalid arguements");
//        } else if (idx == 0) {
//            removeFirst();
//        } else if (idx == size - 1) {
//            removeLast();
//        } else {
//            Node temp = head;
//            for (int i = 0; i < idx - 1; i++) {
//                temp = temp.next;
//            }
//            temp.next = temp.next.next;
//            size--;
//        }
//
//
//        public int kthFromLast(int k){
//            Node s = head;
//            Node f = head;
//
//            for (int i =0; i < k; i++){
//                f = f.next;
//            }
//
//            while(f!=null){
//                s = s.next;
//                f = f.next;
//            }
//            return s;
//        }
//    }
//
//
//    public class Node {
//        private int value;
//        private Node next;
//        public Node(int value){
//            this.value = value;
//        }
//
//        public Node(int value, Node next){
//            this.value = value;
//            this.next = next;
//        }
//    }
//
//}
//
//
