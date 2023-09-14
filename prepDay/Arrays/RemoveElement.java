package prepDay.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,4,5,6,6,7};
        int n= 2;
        for(int i =0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        removeElement(arr1, n);

    }

    private static void removeElement(int[] arr1 , int n) {
        int[]arr2 = new int[arr1.length-1];
        List<Integer> list = new ArrayList<>();
        for(int num : arr1){
            list.add(num);
        }
        list.remove(n);

        for(int i = 0; i< list.size(); i++){
            arr2[i] = list.get(i);
        }
        for(int i =0; i< arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
