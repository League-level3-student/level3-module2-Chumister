package _01_Searching_Algorithms;

public class _00_LinearSearch {
	// When finding the location of a certain element in an array, 
	// there are many algorithms that can do so. The simplest is the
	// linear search. This is best for short unsorted lists of data.
	public static int linearSearch(int arr[], int x) {
		//1. Complete the method using a for loop to find the value
		//   in the array. Return the location in the array
		//   where the value was found.
		//   If the value is not found in the array, return -1.
		int n = arr.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	            return i; 
	    } 
	    return -1; 
	} 
	  
	public static void main(String args[]) 
	{ 
	    int arr[] = { 2, 3, 4, 10, 40 };  
	    int x = 10; 
	      
	    int result = linearSearch(arr, x); 
	    if(result == -1) 
	        System.out.print("Element is not present in array"); 
	    else {
	        System.out.print("Element is present at index " + result); 
			}
		}
	}

