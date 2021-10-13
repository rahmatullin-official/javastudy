import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int rub = (a * c) + b * c / 100;
        int kop = b * c % 100;
        System.out.println(rub + " " + kop);
    }
}
