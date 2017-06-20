package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = in.nextLine();
		in.close();

		char[] inputArray = input.toCharArray();
		StringBuffer output = new StringBuffer();
		System.out.println(inputArray.length);
		for (int i = inputArray.length - 1; i >= 0; i--) {
			output.append(inputArray[i]);
		}
		System.out.println(output.toString());
		String[] temp = output.toString().split("\\s+");
		System.out.println(Arrays.toString(temp));	
		StringBuffer out = new StringBuffer();
		for (int i = temp.length - 1; i >= 0; i--) {
			out.append(temp[i]);
			out.append(" ");
		}
		System.out.println(out.toString().trim());
	}
}
