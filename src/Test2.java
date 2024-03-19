import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        if(str1.equals(str2)){
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }
    }
}
