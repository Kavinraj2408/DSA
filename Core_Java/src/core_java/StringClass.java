package core_java;

public class StringClass {

	public static void main(String[] args) {
		String str = "KAVIN";
		System.out.println("Original String --> " + str);
		str = reverseString(str);
		System.out.println("Rversed String --> " + str);
	}

	public static String reverseString(String str) {
//		char[] array = str.toCharArray();
//		int left = 0;
//		int right = str.length() - 1;
//		
//		while(left<right) {
//			char temp = array[left];
//			array[left] = array[right];
//			array[right] = temp;
//			
//			left++;
//			right--;
//		}
//		retrun new String(array);
		StringBuilder sb = new StringBuilder(str);
		StringBuffer sbb = new StringBuffer(str);
		sbb.reverse();
		sb.reverse();
		return sbb.toString();
	}

}
