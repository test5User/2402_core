package _06_generics._01_precondition._01_duplication;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoxInt {
    private Integer value;

    public Integer doSmth() {
        return value;
    }
}
