package _13_xml._05_sax;

import lombok.SneakyThrows;

import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var factory = SAXParserFactory.newInstance();
        var parser = factory.newSAXParser();
        var handler = new SaxHandler();
        parser.parse(new FileInputStream("src/_13_xml/_05_sax/cats.xml"), handler);
        var cats = handler.getCats();
        cats.forEach(System.out::println);
    }
}
