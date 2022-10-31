package Homevork;

import java.util.Scanner;

public class hm5 {
    private static int a;

    public static void main(String[] args) {
        double result = 0;
        int n = 5;
        for(int i = 1; i<n; i++){
            result+=(double)1/i;
        }
        System.out.format("%.3f", result);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        while(number>0){
            sum+= number % 10;
            number=number/10;
            System.out.println(sum);
    }

    }

