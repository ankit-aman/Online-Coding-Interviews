package Paypal;

public class PairOfSongs {

    public static void main(String[] args) {

        int[] arr={30,20,150,100,40};

        int[] temp=new int[60];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%60!=0){
                temp[i]=0;
            }
        }

    }
}
