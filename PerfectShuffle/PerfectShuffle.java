import java.util.*;

public class PerfectShuffle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        while (n > 0) {
            int a = n / 2 + (n % 2 == 0 ? 0 : 1);
            int b = n - a;

            String[] list1 = new String[a];
            for (int i = 0; i < a; i++) {
                list1[i] = scan.nextLine();
            }
            String[] list2 = new String[b];
            for (int i = 0; i < b; i++) {
                list2[i] = scan.nextLine();
            }

            int c = 0;
            int d = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.println(list1[c++]);
                } else {
                    System.out.println(list2[d++]);
                }
            }
            n = Integer.parseInt(scan.nextLine());
        }
    }
}
