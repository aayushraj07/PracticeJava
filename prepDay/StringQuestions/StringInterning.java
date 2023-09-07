package prepDay.StringQuestions;

public class StringInterning {

    public static void main(String[] args){
        String s1 = "aayush";
        String s2 = "aayush";
        if(s1.equals(s2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        String s3 = "Aayush";
        System.out.println(s3.hashCode());
        s3 += " Raj";
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println(s3.hashCode());

    }
}
