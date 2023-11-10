package newTest;

import java.util.Scanner;

public class TestMAin {
    public static void main(String[] args) {
        System.out.println("Test to fail!");
        int n = 4;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int t : arr){
            System.out.println("for loop value :" + t);
        }

        int arr2[] = {1,2,3,4};
        int arr3[] = new int[arr2.length];
        System.out.println("Last Element : " + arr[n-1]);
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
    }
}
