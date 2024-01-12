package pepCoding.DP.PatternQuestion;

public class CoinChangeCombination {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int amount = 9;

        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i = 0; i< arr.length; i++){
            for (int j = arr[i]; j < dp.length; j++){
                dp[j] += dp[j - arr[i]];
            }
        }
        System.out.println(dp[amount]);
    }
}