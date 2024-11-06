package Test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] arr={1,12,4,6,12,11};
        Integer[] arr2={12,11};

        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

        //System.out.println(Arrays.stream(arr).toList());
        //Second highest
        //System.out.println(Arrays.stream(arr).distinct().sorted(Collections.reverseOrder()).skip(1).findFirst());

    }
}
