package basic;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]){
        int[] numbers =  {1,4,3,5,6,22};
        Arrays.sort(numbers);
        System.out.println(binarySearch(numbers, 22));

//        built in binary search
        System.out.println(Arrays.binarySearch(numbers,3));
    }

    private static int binarySearch(int[] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length -1;

        while(low<= high){
            int middlePosition = (low + high)/2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition-1;
            }

            if(numberToFind > middleNumber){
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
