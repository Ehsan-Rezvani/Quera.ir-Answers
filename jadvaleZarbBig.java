import java.util.*;
public class jadvaleZarbBig {
    public static void main(String[] args) {
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < a+1; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println("");
        }
    }
}
