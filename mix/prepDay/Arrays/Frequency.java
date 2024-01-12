package prepDay.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,4,5,6,6,7};
        int n = 4;
        frequency(arr1 ,n);
    }

    private static void frequency(int[] arr1, int n) {
        int freq = 0;
        for (int num : arr1){
            if (num == n){
                freq++;
            }
        }
        System.out.println("Frequency of " + n + " is " + freq);
    }
}
