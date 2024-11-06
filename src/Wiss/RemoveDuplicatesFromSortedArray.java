package Wiss;

/******************************************************************************

Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.

Examples: 

Input: arr[] = {2, 2}
Output: arr[] = {2,null}
Explanation: All the elements are 2, So only keep one instance of 2.

Input: arr[] = {1, 2, 2, 3, 4, 4 }
Output: arr[] = {1, 2, 3, 4,null,null}

*******************************************************************************/
public class RemoveDuplicatesFromSortedArray
{
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;
// 		Set<Integer> out=Arrays.stream(arr).boxed().collect(Collectors.toSet());
//		 System.out.println(out.toArray());
//		 for(Integer i:out){
//			 System.out.print(i+" ");
//		 }
        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
	static int removeDuplicates(int arr[], int n){

		int j = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		return j;

	   // return 0;
	    
	}
	

}
