package basic;

public class Reverse {

    public static void main(String[] args){
        int number = 4352;
        int rem, rev = 0;

        while(number !=0){
            rem = number%10;
            rev = (rev * 10) + rem;
            number /= 10;
        }
        System.out.println("Reverse number is " +rev);
    }
}
