import java.util.Scanner;

/**
 * Created by me on 28.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число от 0 до 99: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i >= 0 && i <= 99) {
                process(i);
            }
            else {
                System.out.print("Необходимо число от 0 до 99");
            }
        }
        else {
            System.out.print("Необходимо число от 0 до 99");
        }
    }

    public static void process(int i) {
        String number = "";
        if (i <= 9) {
            switch (i) {
                case 0:
                    number = "Ноль";
                    break;
                case 1:
                    number = "Один";
                    break;
                case 2:
                    number = "Два";
                    break;
                case 3:
                    number = "Три";
                    break;
                case 4:
                    number = "Четыре";
                    break;
                case 5:
                    number = "Пять";
                    break;
                case 6:
                    number = "Шесть";
                    break;
                case 7:
                    number = "Семь";
                    break;
                case 8:
                    number = "Восемь";
                    break;
                case 9:
                    number = "Девять";
                    break;

            }
            System.out.print(number);
        } else if (i <= 20) {
            switch (i) {
                case 10:
                    number = "Десять";
                    break;
                case 11:
                    number = "Одинадцать";
                    break;
                case 12:
                    number = "Двенацать";
                    break;
                case 13:
                    number = "Тринадцать";
                    break;
                case 14:
                    number = "Четырнадцать";
                    break;
                case 15:
                    number = "Пятнядцать";
                    break;
                case 16:
                    number = "Шестнадцать";
                    break;
                case 17:
                    number = "Семьнадцать";
                    break;
                case 18:
                    number = "Восемьнадцть";
                    break;
                case 19:
                    number = "Девятндцать";
                    break;
                case 20:
                    number = "Двадцать";
                    break;
            }
            System.out.print(number);

        }
        else {
            intToChar(i);
        }
    }

    public static void intToChar(int i) {
        String s = "" + i;
        int first = Character.getNumericValue(s.charAt(0));
        int second = Character.getNumericValue(s.charAt(1));
        twentyPlus (first, second);
    }

    public static void twentyPlus ( int first, int second) {
        String[] tens = {"Двадцать", "Тридцать", "Сорок", "Пятдесят", "Шестдесят", "Семьдесят", "Восемьдесят", "Девяносто"};
        String[] ones = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        if (second == 0) {
            System.out.println(tens[first - 2]);
        }
        else {
            System.out.println(tens[first - 2] + " " + ones[second - 1]);
        }

    }
}