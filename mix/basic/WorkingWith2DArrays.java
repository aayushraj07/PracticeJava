package basic;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args){
        char[][] box = new char[3][3];
        for(int i = 0; i<3;i++){
            for(int j= 0; j<3;j++){
                box[i][j] = 'x';
            }
        }
        System.out.println(Arrays.deepToString(box));
    }
}
