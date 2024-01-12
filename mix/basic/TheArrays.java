package basic;


import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {


        String[] arrs = new String[4];

        arrs[0] = "Ravi";
        arrs[1] = "Kishan";
        arrs[2] = "Singh";
        System.out.println(Arrays.toString(arrs));
        System.out.println(arrs.length);
        String[] arr_new = new String[arrs.length-1];
        System.out.println(arr_new.length);

        System.out.println(Arrays.toString(arr_new));
        System.out.println(arrs[1]);
        System.out.println(arr_new[0]);


        for(int i =0; i< arrs.length;i++){
            System.out.println(arrs[i]);
        }

        for(int i =arrs.length -1; i >= 0;i--){
            System.out.println(arrs[i]);
        }

        for(String arr : arrs){
            System.out.println(arr);
        }

        Arrays.stream(arrs).forEach(System.out::println);


    }

}
