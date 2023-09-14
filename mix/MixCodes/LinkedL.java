import java.util.*;

public class LinkedL{

    Node head;
    private int size;

    LinkedL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // // Add 
    // public void addFirst(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    // }

    // // Add Last
    // public void addLast(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }

    //     Node curNode = head;
    //     while(curNode.next != null){
    //         curNode = curNode.next;
    //     }

    //     curNode.next = newNode;
    // }


    // // Print
    // public void printList(){
    //     if(head== null){
    //         System.out.println("Empyt list");
    //         return;
    //     }

    //     Node curNode = head;
    //     while(curNode != null){
    //         System.out.print(curNode.data + " -> ");
    //         curNode = curNode.next;
    //     }
    //     System.out.println("Null");
    // }

    // // delete
    // public void deleteFirst(){
    //     if(head == null){
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     size--;
    //     head = head.next;
    // }

    // // delete Last
    // public void deleteLast(){
    //     if(head == null){
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     size--;
    //     if(head.next == null){
    //         head =null;
    //     }


    //     Node secondLast = head;
    //     Node lastNode = head.next;
    //     while(lastNode.next != null){
    //         lastNode = lastNode.next;
    //         secondLast = secondLast.next;
    //     }

    //     secondLast.next = null;
    // }

    // public int getSize(){
    //     return size;
    // }

    public  static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.add("Aayush");
        list.addFirst("My");
        list.addFirst("name");
        list.addFirst("is");
        System.out.println(list);
        // list.add("Raj", 4);
        list.remove(3);
        System.out.println(list);
        



        // LinkedL list = new LinkedL();
        // list.addFirst("name");
        // list.addLast("is");
        // list.printList();
        // // list.deleteFirst();
        // // list.deleteLast();
        // System.out.println(list.getSize());
       
        // list.deleteLast();
        // list.printList();
        


    }
}