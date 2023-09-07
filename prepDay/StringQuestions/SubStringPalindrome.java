package prepDay.StringQuestions;

import java.util.Scanner;

public class SubStringPalindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        solution(s1);
    }

    public static void solution(String s1){
        for(int i = 0; i< s1.length(); i++){
            for(int j = i+1; j<=s1.length();j++){
                String substring = s1.substring(i,j);
                if(isPalindromeValue(substring) == true){
                    System.out.println(substring + " is a palindrome");
                }
            }
        }
    }
    public static boolean isPalindromeValue(String s1){
        int i =0;
        int j = s1.length()-1;
        while(i <= j){
            char ch1 = s1.charAt(i);
            char ch2 = s1.charAt(j);
            if(ch1!=ch2){
                return false;
            }else {
                i++;
                j--;
            }
        }

//        StringBuilder reverse = new StringBuilder(s1).reverse();
//        if(s1.equals(reverse)){
//            System.out.println(s1 + " is a palindrome!");
//        }else {
//            System.out.println("no palindrome found");
//        }
        return true;
    }
}
