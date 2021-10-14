import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat(), b = in.nextFloat();
        System.out.println(a * a + b * b > 4 && b < a && a < 2 ? "YES":  "NO");
    }
}
