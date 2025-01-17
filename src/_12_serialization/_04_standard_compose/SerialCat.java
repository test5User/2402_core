package _12_serialization._04_standard_compose;

import java.io.Serializable;
import java.util.StringJoiner;

public class SerialCat implements Serializable {
    static final long serialVersionUID = 1L;
    static String STATIC_FIELD = "static";
    final String name;
    transient SerialBox box;

    public SerialCat(String name, SerialBox box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SerialCat.class.getSimpleName() + "[", "]")
                .add("static='" + STATIC_FIELD + "'")
                .add("name='" + name + "'")
                .add("box=" + box)
                .toString();
    }
}
