import java.util.*;

public class ViveLaDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		while (a != 0) {
			int count = 0;
			while (!(a == b && b == c && c == d)) {
				int aTemp = a;
				a = Math.abs(a - b);
				b = Math.abs(b - c);
				c = Math.abs(c - d);
				d = Math.abs(d - aTemp);
				count++;
			}
			System.out.println(count);

			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();
		}
	}
}
