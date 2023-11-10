package Scaler.SpaceTimeComplexity;

public class PartitionArray {

    public static void main(String[] args) {
        int arr[] = {4,23,2,1,9,6,7,8};
        int pivot = 5;
        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] > pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        int ndad = 32;

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}