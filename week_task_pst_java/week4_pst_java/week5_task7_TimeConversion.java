import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int hour=Integer.parseInt(s.substring(0,2));
        if(s.charAt(8)=='A'){
            if(hour==12){
                hour=0;
                            }
        }
        else{
            if(hour!=12){
                hour+=12;
            }
        }
        String strh=String.format("%02d",hour);
        StringBuilder sb=new StringBuilder();
        sb.append(strh);
        sb.append(s.substring(2,8));
        return sb.toString();
    }

}

public class week5_task7_TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}