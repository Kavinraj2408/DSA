package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
	public static void main(String[] args) {
		int[] nums = {2,3,5,8};
		int tar = 11;
		int[] ans = twoSum(nums,tar);
		for(int n:ans) {
			System.out.println(n);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //     if(nums[i]+nums[j]==target){
            //         return new int[]{i,j};
            //     }
            // }
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }

            map.put(nums[i],i);

//            System.out.println(map);
        }
        return new int[]{};
    }

}
