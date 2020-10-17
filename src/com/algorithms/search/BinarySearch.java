package com.algorithms.search;


/* 
 * Find the element in a sorted Array
 * using BinarySearch we can find in O(log N) time
 * 
 * Input: [2, 3, 4, 10, 40]
 * Output: 3
 * */
public class BinarySearch {

	int binarySearch(int a[], int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (a[mid] == x) {
				return mid;
			}
			
			if (a[mid]>x) {
				return binarySearch(a, l, mid-1, x);
			}
			return binarySearch(a, mid+1, r, x);
		}
		return -1;
	}
	
	// Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
