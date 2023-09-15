package mix;

public class Dontrepeat {

    public static void main(String args[]){
        lengthofLongestSubstring("aayush");
    }
    public static int lengthofLongestSubstring(String s){
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            StringBuilder currentSubString = new StringBuilder();
            for(int j = i; j < s.length();j++){
                if(currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentSubString.append(s.charAt(j));
                max = Math.max(max,currentSubString.length());
//                if(currentSubString.length() > max){
//                    max = currentSubString.length();

                }
            }
        return max;
        }
    }

