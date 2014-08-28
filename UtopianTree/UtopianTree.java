import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int t = inputScanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = inputScanner.nextInt();
            int height = 1;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    height *= 2;
                } else {
                    height += 1;
                }
            }
            System.out.println(height);
        }
    }
}
