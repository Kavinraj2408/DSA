package com.array;

public class BubbleSortingArray {
	public static void main(String[] args) {
		int[] nums = {3,6,8,4,2,9,22,12};	
		int temp =0;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;				
			    }			
			}
		}
		for(int n:nums) {
			System.out.print(n+ " ");
		}
		
	}

}
