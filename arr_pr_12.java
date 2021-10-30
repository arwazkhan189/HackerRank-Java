package com.company;

import java.util.Arrays;
import java.util.*;

public class arr_pr_12 {
    public static void main(String[] args) {

        // coping the arrays
        String [] array1 = {"java" , "oracle", "php"};
        String [] array2 = {"c" , "oracle", "php"}; //data receive


        System.out.println("original array is: " + Arrays.toString(array1));
        System.out.println("original array is: " + Arrays.toString(array2));


        for(int i=0; i<array1.length; i++){ // looping
            for ( int j=0; j<array2.length; j++){
                if(array1[i].equals(array2[j])) {
                    System.out.println( "duplicates array are: " + array2[j]); // print
                }
            }
        }
    }
}
