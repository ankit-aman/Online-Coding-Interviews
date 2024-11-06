package Test2;

import java.util.Arrays;

class OccurencesArray {

    public static void sortedArr(int[] arr) {
        for (int i = 0; i < (arr.length - 1)/2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("sorted array= " + Arrays.toString(arr));
    }


    public void printOccurances(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if (visited[i] == true) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    visited[i] = true;
                    count++;
                }
                // System.out.println(Arrays.toString(visited));
            }
            System.out.println("number: " + arr[i] + ": count : " + count);
        }
        System.out.println(Arrays.toString(visited));

    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 80, 30, 15, 50, 15, 62, 75};

    OccurencesArray.sortedArr(arr);
    }

}