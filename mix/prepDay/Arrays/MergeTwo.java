package prepDay.Arrays;

public class MergeTwo {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4};
        int[]arr2 = {5,6,7};
        int mergedLength = arr1.length + arr2.length;
        merge(arr1,arr2, mergedLength);
    }

    private static void merge(int[] arr1, int[] arr2, int mergedLength) {
        int[] merged = new int[mergedLength];
        for(int i =0; i<arr1.length; i++){
            merged[i] = arr1[i];
        }

        for(int i = 0; i< arr2.length; i++){
            merged[arr1.length+i] = arr2[i];
        }
        for(int i =0; i< merged.length; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
