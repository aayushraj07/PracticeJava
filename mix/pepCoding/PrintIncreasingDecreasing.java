package mix.pepCoding;

import java.util.Scanner;

public class PrintIncreasingDecreasing {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {

        if (n == 0) {                 //1
            return;
        }
        System.out.println(n);        //2
        pdi(n - 1);                   //3
        System.out.println(n);        //4
    }
}
