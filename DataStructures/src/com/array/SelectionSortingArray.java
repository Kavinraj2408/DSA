package com.array;

public class SelectionSortingArray {
	public static void main(String[] args) {
		int[] nums = {7,2,4,1,9,6,5};
		int size = nums.length;
		int temp = 0;
		int index = 0;
		
		System.out.println("Before Sorting..");
		for(int n:nums) {
			System.out.print(n);
		}
		System.out.println();
		
		for(int i=0;i<size-1;i++) {
			index = i;
			for(int j=i+1;j<size;j++) {
				if(nums[index]>nums[j]) {
					index = j;
				}
			}
			temp = nums[index];
			nums[index] = nums[i];
			nums[i] = temp;
		}
		
		System.out.println("After Sorting..");
		for(int n:nums) {
			System.out.print(n);
		}
	}

}
