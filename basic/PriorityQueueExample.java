package basic;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
//        ascending
//        @Override
//        public int compareTo(Student s2){
//            return this.rank - s2.rank;
//        }

//        descending
        @Override
        public int compareTo(Student s2){
            return s2.rank - this.rank;
        }
    }


    public static void main(String args[]){
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(new Student("Aayush",  3));
        students.add(new Student("Ramesh",  1));
        students.add(new Student("Rajesh",  4));
        students.add(new Student("Payet",  2));
        while(!students.isEmpty()){
            System.out.println(students.peek().name +" ->" +students.peek().rank);
            students.remove();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(4);
        pq.add(4);
        pq.add(22);

//        by default it gives ascending values

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(2);
        pq1.add(4);
        pq1.add(4);
        pq1.add(22);

//        by default it gives ascending values

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}