package Lessons;

import java.util.Scanner;

public class Lesson_Do_While {
    public static void main(String[] args) {
        // Посчитайте сумму чисел которуе введны с консоли.Последнте число =0
        int number;
        int sum = 0;
        Scanner scanner = new Scanner (System.in);
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number!=0);


    }
}
