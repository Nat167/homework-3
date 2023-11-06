import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание №10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int number = scanner.nextInt();
        var podezd = (number + 35) / 36;
        number -= (podezd - 1) * 36;
        var etag = (number + 3) / 4;
        System.out.println("podezd " + podezd);
        System.out.println("etag" + etag);

    }
}
