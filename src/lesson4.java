import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        int wan = grade.nextInt();
        int two = grade.nextInt();
        int free = grade.nextInt();
        System.out.println(wan + two + free / 3);
        int air = 29;
        int water = 25;
        boolean sea = air > 28;
        boolean sea2 = water < 26;
        System.out.println(sea);
        System.out.println(sea2);
    }
}