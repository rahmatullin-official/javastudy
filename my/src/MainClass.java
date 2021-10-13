import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),s,m,h;
        if (a < 86400) {
            s = a % 60;
            m = (a / 60) % 60;
            h = ((a / 60) / 60) % 60;
        }
        else {
            s = (a % 86400) % 60;
            m = ((a % 86400) / 60) % 60;
            h = (((a % 86400) / 60) / 60) % 60;
        }
        String s1 = "", m1= "";
        s1 = "" + s;
        m1 = "" + m;
        if (s < 10) {
            s1 = "0" + s1;
        }
        if (m < 10) {
            m1 = "0" + m1;
        }
        System.out.println(h + ":" + m1 + ":" + s1);
    }
}
