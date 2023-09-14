import java.util.Scanner;

public class Strings {

    public static void main(String args[]){
        // String name = "Tony";
        // String fullName = "Tony Stark";

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        String name = "Aayush Raj";
        System.out.println("Your name is  "+ name);

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName+" " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        for(int i =0; i< fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        if(name.compareTo(fullName) == 0) {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        String mid = name.substring(3, name.length());
        System.out.println(mid);
    }
    
}
