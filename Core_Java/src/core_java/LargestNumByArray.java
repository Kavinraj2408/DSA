package core_java;

import java.util.Arrays;

public class LargestNumByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"3","30","34","9","5"};
		System.out.println(largestNum(arr));

	}
	
	public static String largestNum(String arr[]) {
		Arrays.sort(arr, ((num1,num2)->(num2+num1).compareTo(num1+num2)));
		String str="";
		for(String s:arr) {
			str=str+s;
		}
		return str;
	}

}
