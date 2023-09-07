package prepDay.StringQuestions;

public class StringBuilders {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("aayush");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        StringBuilder sb1 = new StringBuilder("aayush");
        System.out.println(sb1.hashCode());
        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0,' ');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.setCharAt(0,'-');
        System.out.println(sb);

    }
}
