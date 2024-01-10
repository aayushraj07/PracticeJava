package testing;

public class TestConstruct {

    public TestConstruct(){
        System.out.println("Constructor Works!");
    }
    public void TestObject(){
        System.out.println("Object Created!");
    }

    public static void main(String[] args) {
        System.out.println("Main Function Works");
        TestConstruct testConstruct = new TestConstruct();
    }
}
