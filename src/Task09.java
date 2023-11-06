import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание №9");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты начала отрезка (x1 y1)");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Введите координаты конца отрезка (x2 y2)");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();


        if (x1 == x2 && y1 == y2){
            System.out.println("Тип отрезка: точка");

        }else if (x1 == x2) {
            System.out.println("Тип отрезка: обрыв");
        }else {
            double slope = (y2 - y1) / (x2 - x1);
            if (slope == 0) {
                System.out.println("Тип отрезка: ровная дорога");
            } else if (slope > 0) {
                System.out.println("Тип отрезка: подъем");
            } else {
                System.out.println("Тип отрезка:спуск");
            }
        }
    }
}
