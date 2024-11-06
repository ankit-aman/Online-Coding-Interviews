package Test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    //check two strings are anagram

    public boolean checkAnagram(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        int length=s1.length();

        char[] stringArr=new char[length];

        Map<Character,Integer> value1=new HashMap<>();
        Map<Character,Integer> value2=new HashMap<>();

        //Arrays.asList(s1.toCharArray()).stream().collect(Collectors.groupingBy(Collection));

        for(int i=0;i<length;i++){
            if(value1.containsKey(s1.charAt(i))){
                value1.put(s1.charAt(i),value1.get(s1.charAt(i))+1);
            }
            else {
                value1.put(s1.charAt(i),1);
            }

            if(value2.containsKey(s2.charAt(i))){
                value2.put(s2.charAt(i),value2.get(s2.charAt(i))+1);
            }
            else {
                value2.put(s2.charAt(i),1);
            }
        }

        return value1.equals(value2);

    }

    public static void main(String[] args) {

        Test test=new Test();
        System.out.println(
    test.checkAnagram("SILENTS","LISTENS"));

    }

}
