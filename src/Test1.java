import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + ">" + b);
        }
        if (a < b) {
            System.out.println(a + "<" + b);
        } else {
            System.out.println(a + "=" + b);
        }
        int c = a+b;
        System.out.println(a + "+" + b + "=" + c);
        int d = a-b;
        System.out.println(a + "-" + b + "=" + d);
        double e = a/b;
        System.out.println(a +" /" + b + "=" + e);
        int f = a*b;
        System.out.println(a + "*" + b + "=" + f);
    }
}

