import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.println((a >= -3 && a <= 5) || (a >= 9 && a <= 15));
    }
}
