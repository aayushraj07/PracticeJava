package mix;

public class ReverseInt {

    public static int reverse(int x,int y){
        return 0;
    }
    public static int reverse(int x){
        int reversed = 0;
        int pop;

        while(x != 0){
            pop = x % 10;
            x /= 10;

            reversed = ( reversed* 10) +pop;
        }
        return  reversed;

//        int result = 0;
//        while (x != 0) {
//            int digit = x % 10;
//            int temp = result * 10 + digit;
//            if ((temp - digit) / 10 != result) {
//                return 0;
//            }
//            result = temp;
//            x /= 10;
//        }
//        return result;

    }

    public static void main(String[] args){
        reverse(2,3);
        reverse(234);
        System.out.println(reverse(45523));
    }
}
