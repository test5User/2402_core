package _12_serialization._04_standard_compose;

import java.util.List;
import java.util.StringJoiner;

public class SerialBox {
    List<String> things;

    public SerialBox(List<String> things) {
        this.things = things;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SerialBox.class.getSimpleName() + "[", "]")
                .add("things=" + things)
                .toString();
    }
}
