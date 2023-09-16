package Scaler.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,5,2,2,2,2};
        marjoirty(arr,arr.length);
    }

    private static void marjoirty(int[] arr, int length) {
        Arrays.sort(arr);
        int count =0;
        for(int i = 0; i < length; i++){
            if(arr[i] == arr[i-1]){
                count++;
                if(count > length/2){
                    System.out.println(i);
                }
            }else{
                count =0;
            }
        }
    }

}

