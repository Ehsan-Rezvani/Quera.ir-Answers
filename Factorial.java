import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = 1;
        int input = Integer.parseInt(in.nextLine());
        for (int i = 1; i < input + 1; i++) R = R * i;
        System.out.println(R);
    }
}
