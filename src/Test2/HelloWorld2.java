package Test2;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Arrays;
import java.util.List;
//remove last element using foreach
class HelloWorld2 {
    public static void main(String[] args) {
        Integer[] arr={1,3,4,6,8};
        int size=arr.length-1;
        List<Integer> list= Arrays.stream(arr).toList();
        list.remove(size-1);
        System.out.println(list);
    }
}