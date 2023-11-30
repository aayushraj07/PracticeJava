package basic;

public class TryCatchQ2 {
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("patns");
        }catch (Exception e){
            System.out.println("We need to use number, not a String or something like that!");
        }finally {
            System.out.println("This lines always gets executed!");
        }
        System.out.println("Parsed!");
    }
}
