package mix;

public class StrBuilder {

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Pony");
        System.out.println(sb);

//        character at index 0
        System.out.println(sb.charAt(0));

//        set char at index 0
        sb.setCharAt(0,'T');
        System.out.println(sb);

        sb.insert(0,'s');
        System.out.println(sb);
    }
}
