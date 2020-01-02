package _00_Sorting_Algorithms;

import java.util.Arrays;

public class _00_SortedArrayChecker {
	
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] array){
		for (int i = 1; i < array.length; i++) {
			if (array[i-1]>array[i]) {
				return false;
			}
		}
		return true;
	}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] bool) {
		
		for (int i = 1; i < bool.length; i++) {
			if(bool[i-1]>bool[i]) {
				return false;
			}
		}
return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	public static boolean charArraySorted(char[] izard) {
		for (int i = 1; i < izard.length; i++) {
			if (izard[i-1]>izard[i]) {
				return false;
			}
		}
		return true;
	}
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[] unsorted)  
    {  
        
        int n = unsorted.length;
        char c[] = new char [n]; 
        for (int i = 0; i < n; i++) {  
            c[i] = unsorted.charAt(i);  
        }  
        Arrays.sort(c);  
        for (int i = 0; i < n; i++)  
            if (c[i] != unsorted.charAt(i))   
                return false;  
                
        return true;      
    }  
	
}
