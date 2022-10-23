package Homevork;

import java.util.Scanner;

public class homevorkWhile {
    public static void main(String[] args) {
        int a = 5;
        while(a!=0){
           a--;
            System.out.println("я начинаю разбираться с циклами");
        }
        int number;
        int sum=1;
        Scanner scanner = new Scanner(System.in);
        do {
            number = scanner.nextInt();
            sum=sum*number;
        } while (number != 5);
        System.out.println(sum);

    }
}
