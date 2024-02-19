package com.array;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = {6,3,4,2,8,7};
		int size = nums.length;
		int key = 0;
		int j =0;
		
		System.out.println("Before Sorting..");
		for(int n:nums) {
			System.out.print(n);
		}
		System.out.println();
		
		for(int i=1;i<size;i++) {
			key = nums[i];
			j= i -1 ;
			while(j>=0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j = j-1;
			}
			nums[j+1] = key;
		}
		
		System.out.println("After Sorting..");
		for(int n:nums) {
			System.out.print(n);
		}
	}

}
