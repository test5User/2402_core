package _11_date._03_sdf;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE yyyy-M-dd G 'T' HH:mm:ss:S", new Locale("en"));
        String dateStr = formatter.format(new Date());
        System.out.println(dateStr);
        //Синтаксис
        //D - номер дня в году
        //E - сокращенный день недели, ЕЕЕЕ - полный день недели
        //d, dd - число месяца  7 или 07
        //M, MM, MMM, MMMM - месяц
        //y, yy, yyyy - год
        //G - эра
        //h, hh, H, HH - часы 12-часовой и 24-часовой форматы
        //m, mm - минуты
        //s, ss - секунды
        //S - милисекунды
        //'' - символ делителя (любой)

        //Дату и время из строки
        var someDate = "08-12-2024 15:45";
        var pattern = "dd-MM-y HH:mm";

        formatter.applyPattern(pattern);
        System.out.println(formatter.parse(someDate));
    }
}
