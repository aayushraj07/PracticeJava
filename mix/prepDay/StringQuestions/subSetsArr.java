package prepDay.StringQuestions;

import java.util.Scanner;

public class subSetsArr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int limit = (int)Math.pow(2, arr.length);
        for(int i =0; i< limit; i++){
            String set ="";
            int temp = i;
//            will convert the i to binary and use 0's and 1's
//            to predict to wether to print the number or not
            for(int j= arr.length - 1; j>=0;j--){
                int r =temp%2;
                temp = temp/2;
                if(r==0){
                    set = "-\t" + set;
                }else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);

        }
    }
}
