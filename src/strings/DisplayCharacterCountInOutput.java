package strings;

import java.util.Scanner;

/* You have an input string aaabbbcccddd, you need to display the output as a3b3c3d3. 
 * If input is abbcca then output will be a1b2c2a1
 * */
public class DisplayCharacterCountInOutput {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		char[] inputArray = input.toCharArray();
		// int lastIndex = 0;
		StringBuffer out = new StringBuffer();
		// int i = 0;
		// while (i < inputArray.length - 1) {
		// if (inputArray[i] == inputArray[i + 1]) {
		// i++;
		// } else {
		// out.append(inputArray[i]).append(Integer.toString(i - lastIndex +
		// 1));
		// lastIndex = i + 1;
		// i++;
		// }
		// }
		// System.out.println(out.toString());
		int lastIndex = 0, i = 1;
		while (i < inputArray.length) {
			if (inputArray[i] == inputArray[i - 1]) {
				i++;
			} else {
				out.append(inputArray[i - 1]).append(i - lastIndex);
				lastIndex = i;
				i++;
			}
		}

		System.out.println(out.toString());

	}
}
