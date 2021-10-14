import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println((-a == b || -a == c || -a == d) || (-b == a || -b == c || -b == d) || (-c == a || -c == b || -c == d) || (-d == a || -d == b || -d == c));
    }
}
