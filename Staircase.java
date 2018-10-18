import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static void staircase(int n) {
         for(int i = 1; i <= n; i++){
            System.out.println(repeat(n - i, " ") + repeat(i, "#"));
         } 
    }

    //aux function to repeat "count" times the string "with"
     static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
