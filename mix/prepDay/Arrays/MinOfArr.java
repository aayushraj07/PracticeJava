package prepDay.Arrays;

public class MinOfArr {
    public static void main(String[] args) {
        int[]arr1 = {5,2,3,4};
        minOfArr(arr1);
        maxOfArr(arr1);
    }

    private static void maxOfArr(int[] arr1) {
        int max = arr1[0];
        for(int i =1; i< arr1.length; i++){
            if(max<arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }

    private static void minOfArr(int[] arr1) {
        int minimum = arr1[0];
        for(int i =1; i< arr1.length; i++){
            if(minimum>arr1[i]){
                minimum = arr1[i];
            }
        }
        System.out.println(minimum);
    }
}
