import java.util.*;
public class BaqirNightHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []b = in.nextLine().split(" ");
        int []a = new int[b.length];
        for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(b[i]);
        if(a[0] + a[1] + a[2] == 180 && a[0] != 0 && a[1] != 0 && a[2] != 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
