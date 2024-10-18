package _02_enums._03_enchansed;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    @Getter
    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }
}
