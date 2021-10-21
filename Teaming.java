import java.util.*;
public class Teaming {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int TestCase = 3;
        int r = 0;
        while(TestCase --> 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            r += Math.min(a, b);
        }
        System.out.println(r);
    }
}
