/* Problem 24
Solution to PartyGames
Dave Shuckerow (acm@auburn.edu)
9/24/2014

Given a list of names, find the shortest string that separates
	the list in two halves.

There's a special edge case in this problem that obeys the following logic:
For a given character in the string:
	if that character isn't the end of the string and it isn't Z
		try turning the character into the next character in the alphabet
		if the resulting string divides the list properly
			we found the shortest dividing string.
		otherwise, 
			add the current character as-is to the string
			move on to the next character.
*/

import java.util.*;

public class Party {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int n = Integer.parseInt(in.nextLine());
			if (n == 0) {
				return;
			}
			String[] names = new String[n];
			for (int i=0; i<n; i++) {
				names[i] = in.nextLine().trim();
			}
			Arrays.sort(names);

			String name1 = names[n/2-1];
			String name2 = names[n/2];
			String output = "";
			for (int i=0; i<name1.length(); i++) {
				char ch = name1.charAt(i);
				if (ch < 'Z' && i < name1.length()-1) {
					ch++;
				}
				if ((output+ch).compareTo(name1) >= 0 &&
					(output+ch).compareTo(name2) < 0) {
					output += ch;
					break;
				} else {
					output += name1.charAt(i);
				}
			}
			System.out.println(output);
		}
	}
}