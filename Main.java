public class Main {

    public static void main(String[] args) {
        Student arush = new Student();
        System.out.println(arush.marks);
        People p1 = new People();
        p1.age = 3;
        p1.nation = "US";
    }
}

class People {
    int age;
    String nation;
}

class Student{
    int rno;
    String name;
    int marks=424;

//    Student(){
//        this.rno=3;
//        this.name="Arush";
//        this.marks=424;
//    }
}
