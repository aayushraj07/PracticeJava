package prepDay.Arrays;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,4,5,6,6,7};
        removeDuplicate(arr1);
    }

    private static void removeDuplicate(int[] arr1) {

        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num : arr1){
            if(uniqueElements.add(num)){
                result.add(num);
            }
        }
        int[] arrwithoutDuplicates = new int[result.size()];
        for(int i = 0; i< result.size(); i++){
            arrwithoutDuplicates[i] = result.get(i);
        }
        System.out.println(Arrays.toString(arrwithoutDuplicates));
    }
}
