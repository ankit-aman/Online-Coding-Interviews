package Accolite;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//-----Move Zeros---
//{1, 4, 3, 5, 0,8,0, 3}

//{1, 4, 3, ,5 ,8,3 ,0,0}


class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 0, 8, 0, 3};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }

        for (int j : arr) {
            System.out.print(STR."\{j}, ");
        }

    }
}