package Test2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountJava8 {

    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book",
                "Pen", "Pencil","Paper clip", "Stapler", "Note Book", "Pencil","Paper clip");
        Map<String,Integer> countMap=new HashMap<>();

       System.out.println(stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        for(String s: stationeryList){
            if(countMap.get(s)!=null){
                countMap.put(s,countMap.get(s)+1);
            }
            else {
                countMap.put(s,1);
            }
        }

    }
}
