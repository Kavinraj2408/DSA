package com.array;

import java.util.Arrays;

public class LargestSmallestNumByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"3","30","34","9","5"};
		
		Arrays.sort(arr, (num1,num2)->(num2+num1).compareTo(num1+num2));

//		Arrays.sort(arr, (num1,num2)->(num1+num2).compareTo(num2+num1));
		
		String str = "";
		for(String s:arr) {
			str+=s;
		}
		System.out.println(str);

	}

}
