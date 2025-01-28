package _13_xml._07_jaxb;

import static _13_xml._07_jaxb.utils.CatJaxbUtils.*;

public class Main {
    public static void main(String[] args) {
        var cats = readFromFile();
        print(cats);
        writeToFile(cats);
    }
}
