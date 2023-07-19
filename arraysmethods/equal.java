package com.kodnest.arraysmethods;
import java.util.Arrays;
public class equal {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {1, 2, 3, 4, 5};

	        // Compare arrays
	        boolean equal = Arrays.equals(arr1, arr2);

	        if (equal) {
	            System.out.println("Arrays are equal.");
	        } else {
	            System.out.println("Arrays are not equal.");
	        }
	    }
}
