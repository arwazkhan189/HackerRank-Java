import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt(); // taking input
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i = 1;
        while(i<=10){ // traversing using  while loop
            int prod = N*i;
            System.out.println(N+" x "+i+" = "+prod);
            i +=1; // updation
        }

        scanner.close();
    }
}
