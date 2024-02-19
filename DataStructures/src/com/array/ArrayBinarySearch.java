package com.array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 88;
		int[] nums = {3,8,9,2,5,3,7,88,54,67,23,10};
		
		Arrays.sort(nums);
		
		int sol = binarySearch(nums,target);
		
		if(sol == -1) 
			System.out.println("Not found");
		else
		    System.out.println(sol);

	}
	
	public static int binarySearch(int[] arr,int target) {
		int l =0 ;
		int r = arr.length - 1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				l = mid+1;
			else
				r = mid -1;
		}			
			
		return -1;
	}

}
