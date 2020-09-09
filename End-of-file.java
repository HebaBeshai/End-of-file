import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner input = new Scanner(System.in);
         int counter = 0;
         while(input.hasNext()){
             String userinput = input.nextLine();
             counter++;
             System.out.print(counter+" "+userinput+"\n");
         }
         input.close();
        //      for(int i=1;i<=counter; i++){
             
        
        //  }



    }
}
