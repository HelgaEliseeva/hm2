package Lessons;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {

            ////Мама дала вам N рублей (вводится с консоли). Вы купили пирожки за K рублей и рыбы за M. Узнать, хватит
            //        //ли вам денег
            //
            //        //Вводится три числа N, K, M. Вывести ответ "Да" или "нет".
            Scanner s = new Scanner(System.in);
            int many = s.nextInt();
            int beef = s.nextInt();
            int fisch = s.nextInt();
            int sum = beef + fisch ;
            if (many>=sum){
                System.out.println("Да денег хватило");
            }
            else{
                System.out.println("Денег не хватило");
            }
            ///
            int amountOfMoney = s.nextInt();
            int aplle = s.nextInt();
            int amountAplle = s.nextInt();
            int orange = s.nextInt();
            int amountOrange = s.nextInt();
            int sumOfAplle = aplle*amountAplle;
            int sumOfOrange = orange*amountOrange;
            int expense = sumOfOrange + sumOfAplle;
            if (amountOfMoney>=expense){
                System.out.println("денег хватает");
            }
            else {
                System.out.println("не хватило");
            }

        }
    }

