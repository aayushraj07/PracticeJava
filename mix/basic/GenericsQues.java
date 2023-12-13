package basic;

public class GenericsQues {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<String> iObj = new Test<String>("das");
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
