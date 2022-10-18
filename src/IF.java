import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 1000) {
            System.out.println("у меня есть деньги");
        } else {
            System.out.println("денег нет");

        }
        if (number == 777) {
            System.out.println("но я удачливый");
        }
    }
}

