import java.util.*;

public class UtopianTreeDynamic {

    public static final ArrayList<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int t = inputScanner.nextInt();

        ints.add(1); // A tree with 0 growth cycles is 1 meter tall

        for (int i = 0; i < t; i++) {
            int n = inputScanner.nextInt();
            for (int j = ints.size() - 1; j < n; j++) {
                int height = ints.get(j);
                if (j % 2 == 0) {
                    height *= 2;
                } else {
                    height += 1;
                }
                ints.add(height);
            }
            System.out.println(ints.get(n));
        }
    }
}
