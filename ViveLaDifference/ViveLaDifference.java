import java.util.*;

public class ViveLaDifference {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] c = new int[4];

        for (;;) {

            c[0] = in.nextInt();
            c[1] = in.nextInt();
            c[2] = in.nextInt();
            c[3] = in.nextInt();

            // minor optimization pointed out by Will: all input is constrained
            // to be >0, so if any one of the four is 0 then we've reached end
            // of input, so we could just write:
            //      if (c[0] == 0) return;
            if (c[0] == 0 && c[1] == 0 && c[2] == 0 && c[3] == 0) return;

            System.out.println(dif(c, 0));
        }
    }

    private static int dif(int[] c, int n) {
        if (c[0] == c[1] && c[1] == c[2] && c[2] == c[3]) return n;
        
        int tmp = c[0];
        c[0] = Math.abs(c[0] - c[1]);
        c[1] = Math.abs(c[1] - c[2]);
        c[2] = Math.abs(c[2] - c[3]);
        c[3] = Math.abs(c[3] - tmp);

        return dif(c, n + 1);
    }
}