package _11_date._01_date;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Для работы с датой и временем ранее широко использовались
        // классы Date из пакета utils и sql.
        //Недостатки - изменяемые объекты, нет временной зоны (зона - это часовой пояс jvm),
        //месяцы начинаются с 0, дата хранится в милисекундах от 01.01.1970.
        var now = new Date();
        System.out.println(now);

        var nowSql = new java.sql.Date(now.getTime());
        System.out.println(nowSql);

        //вернуть количество милисекунд
        System.out.println(now.getTime());
    }
}
