import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double initialDeposit = scanner.nextDouble();
       double depositPercentage = scanner.nextDouble();
       int year = scanner.nextInt();
       double interesantAmount = initialDeposit*depositPercentage/100;
       double additionAmount = interesantAmount*year;
       double finalAmount = additionAmount+initialDeposit;
        System.out.println(finalAmount);
       }



    }


