import java.util.*;


public class task5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputLine = scr.nextLine();
        hello(inputLine);

    }
    public static void hello (String s) {

        HashMap<Integer, String> converter = new HashMap<Integer, String>();
        converter.put(1, "один");
        converter.put(2, "два");
        converter.put(3, "три");
        converter.put(4, "четыре");
        converter.put(5, "пять");
        converter.put(6, "шесть");
        converter.put(7, "семь");
        converter.put(8, "восемь");
        converter.put(9, "девять");
        converter.put(10, "десять");

        String[] parts = s.split(" ");
        String phrase = parts[0];
        int num = Integer.parseInt(parts[1]);
        System.out.println("Здравствуй, " + phrase + "! " + "Сумма цифр в числе = " + converter.get(recursiveSum(num)));
    }

    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + recursiveSum(n / 10));
    }
}
