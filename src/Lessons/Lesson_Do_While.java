package Lessons;

import java.util.Scanner;

public class Lesson_Do_While {
    public static void main(String[] args) {
        // Посчитайте сумму чисел которуе введны с консоли.Последнте число =0
      //  int number;
      //  int sum = 0;
        Scanner scanner = new Scanner (System.in);
       // do {
           // number = scanner.nextInt();
            //sum += number;
        //} while (number!=0);
        Scanner sc = new Scanner(System.in);
        //int temp;
        //do{
          //  temp = sc.nextInt();
      //  } while (temp < -15);
      //  System.out.println("разгерметизация, пилоты погибли ");

   String name;
   int count = -1;
         do{
              name = scanner.nextLine();
             count++;
          } while(!name.equals("расчёт окончен"));
        System.out.println(count);





    }
}
