import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        int b,h;
        b= S.nextInt();
        h = S.nextInt();
        if (b<=0||h<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else 
        {
            System.out.println(b*h);
        }
    }
}
