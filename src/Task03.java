import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное : ");
        System.out.println("1. Кошка\n" + "2. Собака\n" + "3. Коза\n" + "4. Овца\n" + "5. Петух\n" +
                "6. Корова\n" + "7. Лев\n" + "8. Мышь\n" + "9. Лошадь\n" + "10. Лягушка\n");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Мее");
                break;
            case 4:
                System.out.println("Бее");
                break;
            case 5:
                System.out.println("Кукуреку");
                break;
            case 6:
                System.out.println("Мууу");
                break;
            case 7:
                System.out.println("РРРРР");
                break;
            case 8:
                System.out.println("Пиии");
                break;
            case 9:
                System.out.println("Игого");
                break;
            case 10:
                System.out.println("Ква");
                break;
            default:
                System.out.println("Такого варианта нет");


        }

    }
}
