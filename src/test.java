import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int number;
        int sum=5;
        Scanner scanner = new Scanner(System.in);
        do {
            number = scanner.nextInt();
            sum=sum*number;
        } while (number != 5);
        System.out.println(sum);


    }
}

