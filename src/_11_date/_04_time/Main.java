package _11_date._04_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        //LocalDate
        var newYear2024 = LocalDate.of(2024, 1, 1);
        var newYear2025 = LocalDate.of(2025, Month.JANUARY, 1);

        //текущая дата
        var now = LocalDate.now();
        //год
        int year = now.getYear();
        //месяц в цифрах
        int monthValue = now.getMonthValue();
        //месяц в виде энам
        Month month = now.getMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        now.getDayOfMonth();
        now.getDayOfYear();
        //Альтернативный способ - использование TemporalField
        now.get(ChronoField.YEAR);
        //Сравнение дат isAfter, isBefore, equals
        var after = newYear2024.isAfter(newYear2025);
        var before = newYear2024.isBefore(newYear2025);
        var eq = newYear2024.equals(newYear2025);
        //високосный
        var leapYear = newYear2024.isLeapYear();

        //получение других значений из существующих
        var newYear2023 = newYear2024.minusYears(1);
        var newYear2026 = newYear2024.plusYears(2);


        //LocalTime
        //LocalDateTime - тоже самое
    }
}
