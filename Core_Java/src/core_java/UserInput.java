package core_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a number..");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		int num = Integer.parseInt(bf.readLine());
		
		System.out.println("Output is -->" + num);
		
		bf.close();
		

	}

}
