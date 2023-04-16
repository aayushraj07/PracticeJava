package basic;

public class ExceptionHandling {
    public static void main(String[] args){

        try{
            int myInt = Integer.parseInt("pants");
        }catch (Exception e){
            System.out.println("you cant make int out of that");
        }finally {
            System.out.println("in the finally block!");
        }
    }
}
