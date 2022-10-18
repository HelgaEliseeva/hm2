import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0, 10));
        s = s.replace('a', 'z');
        System.out.println(s.replace('a', 'z'));
        s = s.replace('b', 'y');
        System.out.println(s.replace('b', 'y'));
        s = s.replace('b', 'z');
        System.out.println(s.replace('c', 'x'));
    }
}
