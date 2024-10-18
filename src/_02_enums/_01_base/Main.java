package _02_enums._01_base;

public class Main {
    public static void main(String[] args) {
        var monday = new DayOfWeekClass("Monday");
        System.out.println(monday);

        var sunday = DayOfWeekBloch.SUNDAY;
        System.out.println(sunday);

        var friday = DayOfWeek.FRIDAY;
    }
}
