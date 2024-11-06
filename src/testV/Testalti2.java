package testV;

/*
given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testalti2 {

    public static void main(String[] args) {
        // 3,1 ,1,2 ,2,3
        Integer[] nums={2,3,1,3,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            list.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Collections.sort(list, (a, b) ->
                (map.get(a) == map.get(b)) ? b-a : map.get(a)-map.get(b));
         int [] n=(list.stream().mapToInt(Integer::intValue).toArray());

         for(int i:n){
             System.out.print(i+" , ");
         }

    }

}
