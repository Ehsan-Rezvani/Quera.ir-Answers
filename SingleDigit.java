import java.util.*;
public class SingleDigit {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String a = in.nextLine();
        while(a.length() != 1) {
            int r = 0;
            char temp[] = a.toCharArray();
            for (int i = 0; i < temp.length; i++) r += Integer.parseInt(String.valueOf(temp[i]));
            a = String.valueOf(r);
        }
        System.out.println(a);
    }
}
