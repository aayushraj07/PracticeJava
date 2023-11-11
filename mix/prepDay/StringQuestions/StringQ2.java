package prepDay.StringQuestions;


import java.util.ArrayList;
import java.util.Scanner;

//Remove Prime number
public class StringQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i =0; i<n; i++){
            a1.add(sc.nextInt());
        }
        solution(a1);
        System.out.println(a1);
    }

    private static void solution(ArrayList<Integer> a1) {

        for(int i=a1.size() -1; i >= 0; i--){
            int val= a1.get(i);
            if(isPrime(val) == true){
                a1.remove(i);
            }
        }
    }

    private static boolean isPrime(int val) {
        for(int div = 2; div*div <= val; div++){
            if(val% div == 0 ){
                return false;
            }
        }
        return true;
    }
}
