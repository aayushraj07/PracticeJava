package pepCoding.DP.PatternQuestion;

import java.util.Scanner;

public class TargetSumSubsets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        int[] arr = {2,3,4,6};
//        for (int i = 0; i< arr.length; i++){
//            System.out.print("Element : ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Target: ");
        int target = 10;
        boolean[][] dp = new boolean[n+1][target+1];
        for (int i =0; i< dp.length; i++){
            for (int j = 0; j< dp[0].length; j++){
                if(i == 0 && j ==0){
                    dp[i][j] = true;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                }else{
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];
                        if(j>= val){
                            if(dp[i-1][j-val] == true){
                                dp[i][j] = true;
                            }
                        }else {
                            dp[i][j] = false;
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][target]);
    }
}
