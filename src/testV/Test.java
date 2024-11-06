package testV;

/*
iven an array of integers between 1  an n, inclusive, where n is the length
Of the array, your function that returns the first integer that appears more than
Once(when the array is read from left to right)
In other words, out of all the integers that might occur more than once in the
Input array, Your function should return the one whose first duplicate value
Has the minimum index.
If no integer appears more than once, your function should return -1.
 Note that you are allowed to mutate the input array.
Input: [2,1,5,2,3,3,4]
Output: 2
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {


    public static int firstDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }

    public static int firstDuplicates(Integer[] arr) {
        Map<Integer, Long> counts = new LinkedHashMap<>();
        counts = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Integer i:counts.keySet()) {
            if(counts.get(i)>1){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        Integer[] arr = {2, 1, 5, 2, 3, 3, 4};


        System.out.println(Test.firstDuplicates(arr));

    }

}
