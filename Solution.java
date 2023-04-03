
import java.util.Arrays;

public class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int option1 = nums[0] + nums[1] + nums[nums.length - 1];
//        int option2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return option1;
    }

    public static void main (String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50,60,60};
        maximumProduct(arr);
        System.out.println(maximumProduct(arr));

    }
}