package prepDay.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4};
        int[]arr2 = {5,6,7};
        int mergedLength = arr1.length + arr2.length;
        twoSum(arr1,arr2);
    }

    private static void twoSum(int[] arr1, int[] arr2) {
        int sum = 0;
        for(int num : arr1){
            sum += num;
        }
        for (int num : arr2){
            sum += num;
        }

        System.out.println("Sum is "+ sum);
    }

}
