import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание №7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String simbol = sc.nextLine();
        Pattern patlatletter = Pattern.compile("[a-z A-Z]");
        Matcher matlattetter = patlatletter.matcher(simbol);

        Pattern patkirletter = Pattern.compile("[а-я А-Я]");
        Matcher matkirtetter = patkirletter.matcher(simbol);

        Pattern patnumber = Pattern.compile("[0-9]");
        Matcher matnumber = patnumber.matcher(simbol);

        if (matlattetter.matches()){
            System.out.println("Латиница");
        }else if (matkirtetter.matches()){
            System.out.println("Кириллица");
        } else if (matnumber.matches()) {
            System.out.println("Цифра");

        }else {
            System.out.println("Невозможно определить");
        }
    }
}
