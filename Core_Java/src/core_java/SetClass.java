package core_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> treeSet = new TreeSet<>();
		
		set.add(87);
		set.add(93);
		set.add(77);
		set.add(45);
		set.add(79);
		
		Iterator<Integer> values = set.iterator();
		
		while(values.hasNext()) {
			System.out.println(values.next());
		}
//		for(int a: set) {
//			System.out.println(a);
//		}
		System.out.println("-------------------");
		treeSet.add(87);
		treeSet.add(93);
		treeSet.add(77);
		treeSet.add(45);
		treeSet.add(79);
		
		for(int a : treeSet) {
			System.out.println(a);
		}
		
	}

}
