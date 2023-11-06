import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6-ное число: ");
        int n = scanner.nextInt();

        int left = (n / 100_000) % 10 + (n / 10_000) % 10 + (n / 1000) % 10 ;
        int right = (n / 100) % 10 + (n / 10) % 10 + n % 10;
        if (left == right) {
            System.out.println("Счастливый");

        }else {
            System.out.println("не ешь! -несчастливый");
        }

    }
}
