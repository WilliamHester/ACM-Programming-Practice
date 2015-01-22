/*
 * Cousins.java
 * David Shuckerow (djs0017@auburn.edu)
 * September 22, 2014
 *
 * 2013 ICPC Division 2
 *
 * Given a tree, count the number of cousins a particular node has.
 */
import java.util.*;
public class Cousins {
	private static int n, k;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			n = in.nextInt();
			k = in.nextInt();
			if (n == 0 && k == 0) return;
			int[] tree = new int[1000002];
			int[] nodes = new int[n];
			int parentInd = -1;
			for (int i=0; i<n; i++) {
				int node = in.nextInt();
				nodes[i] = node;
				if (i == 0) 
					tree[node] = 0;
				else if (node > nodes[i-1] + 1) {
					parentInd += 1;
				}
				if (i != 0)
					tree[node] = nodes[parentInd];
			}

			// Count the cousins.
			int parent = tree[k];
			int grandparent = tree[parent];

			if (parent < 1 || grandparent < 1) {
				System.out.println(0);
				continue;
			}

			int cousins = 0;
			for (int i=0; i<1000002; i++) {
				if (tree[i] != parent && tree[tree[i]] == grandparent)
					cousins++;
			}

			System.out.println(cousins);
		}
	}
}