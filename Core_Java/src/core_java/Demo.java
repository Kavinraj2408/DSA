package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		Comparator<Integer> com = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10 >= o2%10) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		nums.add(44);
		nums.add(74);
		nums.add(49);
		nums.add(10);
		
		Collections.sort(nums,com);
		
		System.out.println(nums);
		
//		for(int b : nums) {
//			System.out.println(b);
//		}
	}

}
