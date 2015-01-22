import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner parts;

        int n, width, length, height, area, m, totalArea;
        // n width length height area m
        // followed by m lines of width and height

        String line;

        while(in.hasNextLine()) {
            line = in.nextLine();
            parts = new Scanner(line);

            n = parts.nextInt();

            if (n == 0) return; // exits the program

            width = parts.nextInt();
            length = parts.nextInt();
            height = parts.nextInt();
            area = parts.nextInt();
            m = parts.nextInt();

            totalArea = width * height * 2 +
                        length * height * 2 +
                        width * length;

            for(int i = 0; i < m; i++) {
                line = in.nextLine();
                parts = new Scanner(line);

                totalArea -= parts.nextInt() * parts.nextInt();
            }

            System.out.println((int)Math.ceil((totalArea * n) / (double)area));

        }

    }

}
