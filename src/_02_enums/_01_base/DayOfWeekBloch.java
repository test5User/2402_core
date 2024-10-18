package _02_enums._01_base;

import lombok.ToString;

@ToString
public class DayOfWeekBloch {
    private String title;

    private DayOfWeekBloch(String title) {
        this.title = title;
    }

    public static DayOfWeekBloch TUESDAY = new DayOfWeekBloch("Tuesday");
    ///
    public static DayOfWeekBloch SUNDAY = new DayOfWeekBloch("Sunday");
}
