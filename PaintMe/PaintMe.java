import java.util.*;

public class PaintMe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (;;) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            int width = in.nextInt();
            int length = in.nextInt();
            int height = in.nextInt();
            int area = in.nextInt();
            int m = in.nextInt();
            int windowsAndDoors = 0;
            for (int i = 0; i < m; i++) {
                windowsAndDoors += in.nextInt() * in.nextInt();
            }

            int sqft = width * length + width * height * 2 + length * height * 2;
            sqft -= windowsAndDoors;
            sqft *= n;
            int cans = sqft / area + (sqft % area == 0 ? 0 : 1);
            System.out.println(cans);
        }
    }
}
