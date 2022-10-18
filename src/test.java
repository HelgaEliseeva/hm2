import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String sign = "!";
        int lenght = line.length();
        int last = line.charAt((lenght) - 1);


        if ((lenght >= 6) || sign.equals(last) ) {
            System.out.println("ваш пароль неверный");
        } else {
            System.out.println("пароль принят");
        }
    }
}
