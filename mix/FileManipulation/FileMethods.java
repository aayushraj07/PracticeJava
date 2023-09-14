package FileManipulation;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
        File myFile = new File("/Users/batmac/Code/practice/newPackage/neww/createdFile.txt");
        try{
            myFile.createNewFile();
        } catch(IOException e){
            System.out.println("Unable to create this File");
            e.printStackTrace();
        }

    }
}
