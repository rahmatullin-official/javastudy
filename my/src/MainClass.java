import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.println(!((a >= -2 && a <= 3) || (a >= 6 && a <= 9)));
    }
}
