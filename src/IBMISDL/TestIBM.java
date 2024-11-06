package IBMISDL;


/*
iven a string s, find the length of the longest
substring
without repeating characters.


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

import java.util.HashMap;

public class TestIBM {

    static int solve(String s) {
        HashMap < Character, Integer > map = new HashMap<>();

        int len=0;
        int left=0, right=0;
        int n=s.length();

        while(right<n){

            if(map.containsKey(s.charAt(right))){
                left=map.get(s.charAt(right))+1;
            }
            map.put(s.charAt(right),right);

            len= Math.max(len, right-left+1);

            right++;
        }


        return len;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }

}
