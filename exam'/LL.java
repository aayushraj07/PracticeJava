import java.util.*;

public class LL {


    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // // Add First Last
    // public void addFirst(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    // }

    // // Last
    // public void addLast(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode.next != null){
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }


    // // print
    // public void print(){
    //     if(head == null){
    //         System.out.println("List is empty!");
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode != null){
    //         System.out.println(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL");

    // }


    // // delete
    // public void deleteFirst(){
    //     if(head == null){
    //         System.out.println("emplyt list");
    //         return;
    //     }

    //     size--;
    //     head = head.next;
    // }

    // // last
    // public void deleteLast(){
    //     if(head == null){
    //         System.out.println("emplyt list");
    //         return;
    //     }

    //     size--;
    //     if(head.next == null){
    //         head=null;
    //         return;
    //     }

    //     Node secondLast = head; 
    //     Node lastNode = head.next;
    //     while(lastNode.next == null){
    //         lastNode = lastNode.next;
    //         secondLast = secondLast.next;
    //     }

    //     secondLast.next = null;
    // }

    // // Size
    // public int getSize (){
    //     return size;
    // }



    public static void main(String args[]){
        LL list = new LL();

        LinkedList<String> list = new LinkedList<>();
        list.add("Aayush");
        List.add("Raj",2);
        // list.addFirst("is");
        // list.addFirst("name");
        // list.addFirst("my");
        // list.addLast("Aayush");
        // list.deleteFirst();
        // list.deleteLast();
        // list.print();
        // System.out.println(list.getSize());


    }
}
