package Test2;

// array of share values : 30days

import java.util.HashMap;
import java.util.Map;

public class ShareValues {

    public static void main(String[] args) {

        Integer arr[]={52,51,102,110,52,33,60};
        Map<Integer,Integer> mapDay=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            mapDay.put(i+1,arr[i]);
        }


    }

}
