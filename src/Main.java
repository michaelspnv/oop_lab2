import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Введите строку: ");
        str = scanner.nextLine();

        Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(1[6-9]\\d{2}|[2-9]\\d{3})$");
        Matcher m = p.matcher(str);

        if (m.matches())
            System.out.println("Данная строка является датой.");
        else
            System.out.println("Данная строка не является датой.");
    }
}