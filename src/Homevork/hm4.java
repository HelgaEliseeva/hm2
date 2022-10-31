package Homevork;

import java.util.Scanner;

public class hm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=2){
            int x = 2;
            while(x<9999){
                if(n%x==0){
                    break;
                }
                else{
                    x++;
                }
            }
            System.out.println(x);
        }
        double initialDeposit = scanner.nextDouble();
        double depositPercentage = scanner.nextDouble();
        int year = scanner.nextInt();
        double interesantAmount = initialDeposit*depositPercentage/100;
        double additionAmount = interesantAmount*year;
        double finalAmount = additionAmount+initialDeposit;
        System.out.println(finalAmount);



    }
}