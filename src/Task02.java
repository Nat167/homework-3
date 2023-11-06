import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время (от 0 до 24): ");
        int time = sc.nextInt();
        if (time >=0 && time < 6 ){
            System.out.println("Доброй ночи!");
        }else if (time >= 6 && time < 12) {
            System.out.println("Доброе утро!");
        }else if (time >= 12 && time < 18){
            System.out.println("Добрый день!");
        } else if (time >= 18 && time < 24) {
            System.out.println("Добрый вечер!");
        }else {
            System.out.println("Введите время в диапазоне от 0 до 24!!");
        }
        System.out.println();

    }
}
