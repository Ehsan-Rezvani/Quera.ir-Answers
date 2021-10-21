import java.util.*;
public class IceKeeper {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a <= 100 && 0 <= a) System.out.println("Water");
        else if (0 > a) System.out.println("Ice");
        else if (a > 100) System.out.println("Steam");
    }
}
