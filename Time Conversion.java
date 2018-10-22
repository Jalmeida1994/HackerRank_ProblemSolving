import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if(s.indexOf('P') >= 0 && s.substring(0, 2).equals("12")){
        }
        else if(s.indexOf('P') >= 0){
            Integer n = Integer.parseInt(s.substring(0, 2));
            s = removeHour(s);
            n += 12;
            String hour = Integer.toString(n);
            s = hour + s;
        }
        else if (s.indexOf('A') >= 0 && s.substring(0, 2).equals("12")){
            s = "00" + s.substring(2);
        }
        return removeHourFormat(s);
    }

    private static String removeHourFormat(String str) {
        return str.substring(0, str.length() - 2);
    }

    private static String removeHour(String str) {
        return str.substring(2, str.length());
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
