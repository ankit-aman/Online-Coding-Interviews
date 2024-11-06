package Test1;

import java.util.Stack;

public class Main {


    public static String removeDup(String input) {
        char[] stack=new char[input.length()];

        int n=input.length();
        int i=0;
        Stack<Character> chars=new Stack<>();

        while(i<n){
            if(chars.empty() || chars.peek()!=input.charAt(i)){
                chars.push(input.charAt(i));
            }
            else{
                chars.pop();
            }
            i++;
        }
    System.out.println(chars);

    return "";

    }

    public static void main(String[] args) {
        //Remove the adjacent duplicate characters from the input string
        //{"abbccdd" -> "a", "bccb" -> "", "xwxx" -> "xw" , "xwxw" -> "xwxw"}

        String str="abbccdd";

        System.out.println("Result"+Main.removeDup(str));
    }
}