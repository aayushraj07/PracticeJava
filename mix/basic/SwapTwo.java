package basic;

public class SwapTwo {
    static int a = 5;
    static int b = 3;

    static{
        System.out.println("this is a static initialisation");
        b= a*5;
    }
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        SwapTwo obj = new SwapTwo();
        obj.swap(x,y);
        System.out.println(SwapTwo.a + " " + SwapTwo.b);
        SwapTwo.b += 3;
        System.out.println(SwapTwo.a + " " + SwapTwo.b);
        SwapTwo.b += 3;
        System.out.println(SwapTwo.a + " " + SwapTwo.b);
        SwapTwo.b += 3;

//        System.out.println("x : " + x);
//        System.out.println("y : " + y);
    }

    private void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
//        System.out.println("x : " + x);
//        System.out.println("y : " + y);
    }
}
