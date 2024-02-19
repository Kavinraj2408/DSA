package com.array;

public class QucikSort {
	public static void main(String[] args) {
		int[] nums = {3,8,5,4,7,9,2};
		int size = nums.length;
		
		quickSort(nums,0,size-1);
		System.out.println("after Sorting..");
		for(int n:nums) {
			System.out.print(n);
		}
	}

	private static void quickSort(int[] nums, int low, int high) {
		if(low < high) {
			
			int par = partition(nums,low,high);
			
			quickSort(nums, low, par-1);
			quickSort(nums, par+1, high);
		}
		
	}

	private static int partition(int[] nums, int low, int high) {
		
		int pivot = nums[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(pivot > nums[j]) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[i+1];
		nums[i+1] = nums[high];
		nums[high] = temp;
		
		return i+1;
	}

}
