package prepDay.StringQuestions;

public class Reverse {

    public static void main(String[] args) {
        String inputString = "Hello World Java";
        String reversedString = reverseWords(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseWords(String inputString) {

        String[] words = inputString.split(" ");

        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1 ; i >= 0; i--){
            reversed.append(words[i]);
            if(i > 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
