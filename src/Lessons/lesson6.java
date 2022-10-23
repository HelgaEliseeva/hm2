package Lessons;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {

         // С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено"
            //если число не равно 0, тогда выведите три сообщения "ERROR"
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number==0){
                System.out.println("ошибка не обнаружена");
            }
            else {
                System.out.println("ERROR");
                System.out.println("ERROR");
                System.out.println("ERROR");
            }
            String line = scanner.nextLine();
            int lenght = line.length();
            char last = line.charAt((lenght) - 2);
            if (lenght<6) {
                System.out.println("ваш пароль неверный");
            }
            else{
                System.out.println("пароль принят");
            }
    }
}
