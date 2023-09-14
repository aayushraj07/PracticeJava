package mix;

import java.util.*;


public class Functions {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of two numbers is : "+ sum );
    // }    

    // public static int calculateSum(int a, int b){
    //     int sum = a+ b;
    //     return sum;
    // }


    // FACTORIAL

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     printFactorial(n);
    // }

    // public static void printFactorial(int n){

    //     if(n<0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int factorial = 1;
    //     for(int i=n; i >= 1; i-- ){
    //         factorial = factorial* i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }


    // PRINT AVERAGE

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     printAvergae(a, b, c);
    //     return;

    // }

    // public static void printAvergae(int a,int b, int c){
    //     float sum = a+b+c;
    //     float average = sum/3;
    //     System.out.println("Average of three  number : " + average);
    //     return;
    // }

// Sum of all ODD numbers

// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     sumOfOdd(n);
// }

// public static void sumOfOdd(int n) {

//     float sum =0;

//     for(int i=1; i<=n; i++){
//         if(i % 2 != 0){
//             sum=sum+i;
//         }
//     }

//     System.out.println("Sum of Odd number from 1 to " + n + " : " + sum);
//     return;
// }



// Return greater of two


public static void main(Strings args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    greaterOfTwo(a, b);
    
    return;

}

public static void greaterOfTwo(int a, int b){
    if(a>b){
        System.out.println(a);
    }else{
        System.out.println(b);
    }
    return;
}


}
