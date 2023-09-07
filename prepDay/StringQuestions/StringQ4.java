package prepDay.StringQuestions;

//Find the Difference between characetes in a String and print the string with the difference
// apple becomes a15p0p-4l-7e (Difference in ASCI)
import java.util.Scanner;

public class StringQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i =1; i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr - prev;
                sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }
}
