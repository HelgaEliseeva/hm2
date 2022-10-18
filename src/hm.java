import java.util.Scanner;

public class hm {
    public static void main(String[] args) {

        // С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено"
        //если число не равно 0, тогда выведите три сообщения "ERROR"
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("ошибка не обнаружена");
        } else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
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

