package mix;

import java.util.Scanner;

public class Arrays {

    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        // 2 D array
        System.out.print("Enter number of rows of the 2D Array: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Enter number of columns of the 2D Array: ");
        int cols = sc.nextInt();
        int[][] twoDnumbers = new int[rows][cols];

        for(int i=0; i< rows; i++){
            // columns
            for(int j = 0; j<cols; j++){
                System.out.print("Enter ["+ i +"] row and column ["+ j + "] element : ");
                twoDnumbers[i][j] = sc.nextInt();
            }
        }


        int x = sc.nextInt();

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j<cols; j++ ){
                if(twoDnumbers[i][j] == x){
                    System.out.println("Number x is present at postion "+ i +"," + j);
                }
            }
        }
    }
    
}
