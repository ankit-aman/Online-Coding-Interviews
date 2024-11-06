package Paypal;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

//import org.json.simple.*;
//import org.json.simple.parser.*;
//import com.google.gson.*;

class Result {

    /*
     * Complete the 'getRelevantFoodOutlets' function below.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/food_outlets?city=<city>&page=<pageNumber>
     *
     * The function is expected to return an array of strings.
     * 
     * The function accepts a city argument (String) and maxCost argument(Integer).
     */
    
    public static List<String> getRelevantFoodOutlets(String city, int maxCost)
    {

        return List.of();
    }
}
public class Solutions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String city = bufferedReader.readLine();

        int maxCost = Integer.parseInt(bufferedReader.readLine().trim());
  
        List<String> result = Result.getRelevantFoodOutlets(city, maxCost);
        
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
