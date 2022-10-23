package Homevork;

import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
       // Найдите следующее четное число
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
        if((number+1)%2==0){
            System.out.println(number+1);
        }
        else {
            System.out.println(number+2);
        }

        Scanner s2 = new Scanner(System.in);
        int wayToMary= s2.nextInt();
        int speedTrain = s2.nextInt();
        int travelTime = s2.nextInt();
        int halfWay = wayToMary / 2;
        int travelledPath =wayToMary- (speedTrain*travelTime);
        if (travelledPath>halfWay){
            System.out.println("ближе к Шерлоку");
        }
        else{
            System.out.println("ближе к Мэри");
        }





    }
}
