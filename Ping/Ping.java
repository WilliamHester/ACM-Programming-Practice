/*
 * Ping.java
 * David Shuckerow (djs0017@auburn.edu)
 * September 22, 2014
 *
 * 2013 ICPC Division II problem
 *
 * Given a binary string indicating when satellites are broadcasting
 *   simultaneously, count the satelites.
 */

import java.util.*;

public class Ping {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			char[] str = in.nextLine().trim().toCharArray();
			if (str[0] == '0' && str.length <= 1) return;
			String output = "";
			for (int i=1; i<str.length; i++) {
				if (str[i] == '1') {
					output += i + " ";
					for (int j=i; j<str.length; j+= i) {
						str[j] = (char)(str[j] ^ ((char)1));
					}
				}
			}
			System.out.println(output.trim());
		}
	}
}