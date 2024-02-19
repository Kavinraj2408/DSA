package com.array;

public class MaxMinArray {
	public static void main(String[] args) {
		int[] nums = {3,7,8,98};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int n: nums) {
			if(n>max) {
				max = n;
			}
			if(n<min) {
				min = n;
			}
		}
		System.out.println("Max --->" + max);
		System.out.println("Min --->" + min);
	}

}
