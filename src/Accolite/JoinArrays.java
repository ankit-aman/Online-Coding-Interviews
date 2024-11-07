package Accolite;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
{1,2,3,4,5}
{6,7,8,3,5}
merge and return distinct sorted element
 
{1, 2, 3, 4, 5, 6, 7, 8}
*/
import java.util.*;
import java.util.stream.*;

class JoinArrays {
    public static void main(String[] args) {
        
        int[] arr1={1,12,3,4,5};
        int[] arr2={6,7,8,3,5};

        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().forEach(System.out::println);
        
    }
}