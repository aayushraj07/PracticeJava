package prepDay.StringQuestions;

import java.util.Scanner;

public class StringQ1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        stringCompress(str);
        System.out.println(stringCompress2(str));
    }

    public static String stringCompress(String str){
        String s = str.substring(0,1);
        for(int i =1; i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr != prev){
                s += curr;
            }
        }
        return s;
    }

    public static String stringCompress2(String str){
        String s = str.substring(0,1);
        int count = 1;
        for (int i = 1; i< str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }else {
                if(count>1){
                    s += count;
                    count =1;
                }
                    s +=curr;
            }
        }
        return s;
    }

}
