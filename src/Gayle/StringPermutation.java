package Gayle;

public class StringPermutation {

    String s="travel";

    void permutation(String s){
        permute(s,"");
    }

    public void permute(String s,String perfix){

        if(s.length()==0){
            System.out.println(perfix);
        }
        else {

            for (int i = 0; i < s.length(); i++) {
                String rem=s.substring(0,i)+s.substring(i+1);
                permute(rem,perfix+s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation stringPermutation=new StringPermutation();
        stringPermutation.permutation("123");
    }

}
