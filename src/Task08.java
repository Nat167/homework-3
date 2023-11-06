import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание №8");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int  x = sc.nextInt();
        System.out.print("Введите второе число : ");
        int y = sc.nextInt();
        if ((x % 2 == 0 && y % 2 ==0) || (x % 2 != 0 && y % 2 != 0)){
            System.out.println("YES");

        }
    }
}
