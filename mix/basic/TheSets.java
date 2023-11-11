//package basic;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class TheSets {
//    public static void main(String[] args){
//        Set<Ball> ballSet = new HashSet<>();
//        ballSet.add(new Ball("red"));
//        ballSet.add(new Ball("blue"));
//        ballSet.add(new Ball("yellow"));
//        ballSet.add(new Ball("black"));
//        System.out.println(ballSet);
//        ballSet.forEach(System.out::println);
//        for (Ball ball : ballSet) {
//            System.out.println(ball);
//        }
//    }
//
//    record Ball(String color){}
//}
