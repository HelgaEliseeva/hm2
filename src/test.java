import java.util.Scanner;

public class test {
    public static int main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       int sum=0;
       while(number>0){
           sum+= number % 10;
           number=number/10;
           System.out.println(sum);

       }


    }



    }


