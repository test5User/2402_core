package _11_date._05_dtf;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        String formattedTime = now.format(DateTimeFormatter.ofPattern("dd MM yyyy HH:mm"));
        System.out.println(formattedTime);

        var someDate = LocalDateTime.parse("15 12 2024 15:46", DateTimeFormatter.ofPattern("dd MM yyyy HH:mm"));
        System.out.println(someDate.format(DateTimeFormatter.ofPattern("dd MMMM y 'T' hh:mm", new Locale("en"))));
    }
}
