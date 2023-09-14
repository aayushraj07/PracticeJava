package prepDay.Recursion;

public class MaxOfArray {

    public static void main(String[] args) {
        int[] arr = {1,2,44,5,66,534};
        System.out.println(maxOfArray(arr));
        System.out.println(maxOfArrayRec(arr,arr.length));
    }

    private static int maxOfArrayRec(int[] arr, int n) {



        return 0;
    }

    public static int maxOfArray(int[] arr){
        int a = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(a> arr[i]){
                arr[i] = a;
            }else{
                a = arr[i];
            }
        }
            return arr[arr.length-1];
    }


}
