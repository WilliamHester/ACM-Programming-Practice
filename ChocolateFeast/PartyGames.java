import java.util.*;

public class PartyGames {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		while (n > 1) {
			ArrayList<String> names = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				names.add(scan.nextLine());
			}
			Collections.sort(names);
			int high = n / 2;
			int low = n / 2 - 1;
			System.out.println(shortestDividingName(names.get(low), names.get(high)));
			n = Integer.parseInt(scan.nextLine());
		}

	}

	public static String shortestDividingName(String name1, String name2) {
		int index1 = 0;
		int index2 = 0;
		StringBuilder sb = new StringBuilder();
		while (index1 < name1.length() && index1 < name2.length()) {
			char a = name1.charAt(index1);
			char b = name2.charAt(index2);
			if (a < b - 1) {
				sb.append((char) (a + 1));
				break;
			} else if (a < b) {
				break;
			}
			sb.append(a);
			index1++;
			index2++;
		}
		if (sb.toString().compareTo(name1) < 0) {
			return name1;
		}
		return sb.toString();
	}

}