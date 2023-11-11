package prepDay.basicsCalculation;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Is Prime");
        }else{
            System.out.println("is not a prime");
        }

    }
    public static boolean isPrime(int num){
        if(num <=1 ){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
