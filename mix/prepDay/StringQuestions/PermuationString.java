package prepDay.StringQuestions;

import java.util.Scanner;

public class PermuationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        int n = str.length();
        int f = factorial(n);
        for(int i =0;i<f;i++){
            int temp = i;
            StringBuilder stringBuilder = new StringBuilder(str);
            for(int div =n; div>=1; div--){
                int q = temp/div;
                int r = temp % div;

                System.out.print(stringBuilder.charAt(r));
                stringBuilder.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }

    }

//    Calculation
    public static int factorial(int n){
        int val = 1;
        for(int i =2; i<=n;i++){
            val *=i;
        }
        return val;
    }
}
