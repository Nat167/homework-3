import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели:  ");
        int dayOfWeekNumber = sc.nextInt();
        switch (dayOfWeekNumber){
            case 1:
                System.out.println("Понедельник!");
                break;
            case 2:
                System.out.println("Вторник!");
                break;
            case 3:
                System.out.println("Среда!");
                break;
            case 4:
                System.out.println("Четверг!");
                break;
            case 5:
                System.out.println("Пятница!");
                break;
            case 6:
                System.out.println("Суббота!");
                break;
            case 7:
                System.out.println("Воскресенье!");
                break;
            default:
                System.out.println("Введите цифру от 1 до 7");
        }
        System.out.println();
    }
}
