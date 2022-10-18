import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner grandmoter = new Scanner(System.in);
        System.out.println("стаж бабушки");
        int time = grandmoter.nextInt();
        System.out.println("количество денег");
        int mony = 100;
        System.out.println(time * mony);
    }
}
