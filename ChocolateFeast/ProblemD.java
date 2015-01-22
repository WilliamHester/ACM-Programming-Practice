import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for (;;) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();

			if (a==0) {
				break;
			}

			int count = 0;

			while (a != b || a != c || a!= d) {
				int temp_a = a;

				a = Math.abs(a-b);
				b = Math.abs(b-c);
				c = Math.abs(c-d);
				d = Math.abs(d-temp_a);

				count++;
			}
			System.out.println(count);
		}
	}
}