package Assignment;

import java.util.Arrays;

public class ArrayAnagram {

	public static void main(String[] args) {
		
		String input1="ram";
		String input2="arm";
		
		if(input1.length()!=input2.length())
		{
			System.out.println("This is not a Anagram");
		}
		else
		{
		System.out.println("Before Sorting");
		char[] output = input1.toCharArray();
		System.out.println(Arrays.toString(output));
			
		char[] output1 = input2.toCharArray();
		System.out.println(Arrays.toString(output1));
		
		Arrays.sort(output);
		Arrays.sort(output1);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(output1));

		
		if(Arrays.equals(output, output1)==true)
		{ }
		else
		{
			System.out.println("This is not a Anagram");
		}
	}
	}
} 
