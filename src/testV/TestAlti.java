package testV;

/*
Given a string, find if it has duplicates characters or not, without using collections or streams API.

Example:

Input : "abcd"
Output: false

Input: "adcde"
Output:  true
 */

public class TestAlti {

    public static boolean testDuplicate(String s){
//29+26
        boolean[] arr=new boolean[55];

        for(int i=0;i<s.length();i++){
            int position=Character.getNumericValue(s.charAt(i));
            if(arr[position]!=true){
                arr[position]=true;
            }
            else if((arr[position]==true)){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str="abcde";

        System.out.println(TestAlti.testDuplicate(str));
    }
}
