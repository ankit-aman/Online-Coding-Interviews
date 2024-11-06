package testV;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
{([])}


Example 1:
Input: s = "(()))"
Output: 1
Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.
Example 2:
Input: s = "())"
Output: 0
Explanation: The string is already balanced.
Example 3:
Input: s = "))())("
Output: 3
Explanation: Add '(' to match the first '))', Add '))' to match the last '('.

 */


import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static boolean isValid(String str){

        Map<Character, Integer> counts=new HashMap<>();

        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            if(counts.containsKey(c)){
                counts.put(c,counts.get(c)+1);
            }
            else
                counts.put(c,1);
        }

        for(Character c:counts.keySet()){
            System.out.println(Test2.isValid(str));
            if(counts.get(c)%2!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str="{[()]}";
        System.out.println(Test2.isValid(str));
    }

}
