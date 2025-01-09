package _11_date._02_calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Для исправления недостатков придумали класс Calendar.
        //Дата и время теперь хранятся не в милисекундах и в полях объекта
        //но... это до сих пор изменяемый объект, месяцы с 0.
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //использование метода set
        calendar.set(2024, 3, 5);
        System.out.println(calendar);

        //если нужно изменить что-то, что не охватывается методами set - используют метод add
        calendar.add(Calendar.YEAR, -1);
        System.out.println(calendar);
    }
}
