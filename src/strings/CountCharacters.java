package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountCharacters {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = in.nextLine();
		in.close();

		Map<Character, Integer> inputHash = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (!inputHash.containsKey(input.charAt(i))) {
				inputHash.put(input.charAt(i), 1);
			} else {
				inputHash.put(input.charAt(i), inputHash.get(input.charAt(i)) + 1);
			}
		}
		
		/*Display characters and their counts*/
		Set<Entry<Character,Integer>> entry=inputHash.entrySet();
		
		for(Entry<Character, Integer> output:entry)
		{
			System.out.println("Character "+output.getKey()+" occurs "+output.getValue());
		}
		

	}
}
