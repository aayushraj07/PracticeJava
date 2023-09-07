package prepDay.twoDArray;

import java.util.Scanner;

public class MatrixMulitplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] one = new int[r1][c1];

        for(int i=0;i<one.length;i++){
            for (int j=0;j<one[0].length;j++){
                System.out.print("Number for oneArray[]");
                one[i][j] = scanner.nextInt();
            }
        }

        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] two = new int[r2][c2];

        for(int i=0;i<two.length;i++){
            for (int j=0;j<two[0].length;j++){
                System.out.print("Number for twoArray[]");
                one[i][j] = scanner.nextInt();
                System.out.println(two.length);
            }
        }

        if(r1!=c2){
            System.out.println("Invalid Input");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                for(int k=0;k< r1;k++){
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        for (int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                System.out.print(product[i][j]);
            }
        }
    }
}
