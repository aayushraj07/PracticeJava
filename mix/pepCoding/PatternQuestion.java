package mix.pepCoding;

import java.util.Scanner;

public class PatternQuestion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }

        for(int i =n; i >= 1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }


        int space = n-1;
        int star = 1;
        for(int i =1; i <= n; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j<= star; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }

        int space1 = 0;
        int star1 = n;
        for(int i =1; i <= n; i++){
            for(int j = 1; j<= space1; j++){
                System.out.print("\t");
            }
            for(int j = 1; j<= star1; j++){
                System.out.print("*\t");
            }
            space1++;
            star1--;
            System.out.println();
        }


        System.out.println("Diamond design only for odd number");

        int space3 = n/2;
        int star3 = 1;
        for(int i =1; i <= n; i++){
            for(int j = 1; j<= space3; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= star3; j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                space3--;
                star3 += 2;
            }else{
                space3++;
                star3 -= 2;

            }
            System.out.println();
        }

        System.out.println("hollow diamond");

        int space4 = 1;
        int star4 = n/2 + 1;

        int st = n / 2 + 1, sp = 1; // sp = spaces ; st = stars
        for (int i = 1; i <= n; i++) {

            for(int j = 0; j <= star4; j++){
                System.out.print("*\t");
            }

            for(int j = 0; j<= space4; j++){
                System.out.print("\t");
            }

            for(int j = 0; j <= star4; j++){
                System.out.print("*\t");
            }


            if(i <= n/2){
                star4--;
                space4 += 2;
            }else{
                star4++;
                space4 -= 2;
            }

            System.out.println();
        }

        System.out.println("Diagonal line");

        st = 1;
        sp = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j<= st; j++){
                System.out.print("*");
            }
            sp ++;
            System.out.println();
        }

        System.out.println("solved without variable");

        for(int i =1; i <= n; i++){
            for(int j = 1; j<= n; j++){
                if (i == j){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        System.out.println("opposite diagonal line");

        int str1 = 1;
        int sp1 = n-1;

        for(int i = 1; i<=n;i++){
            for (int j =1;j<=sp1;j++){
                System.out.print("\t");
            }for (int j =1;j<=str1;j++){
                System.out.print("*");
            }
            sp1--;

            System.out.println();

        }
    }
}

