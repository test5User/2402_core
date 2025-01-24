package _13_xml._06_dom;

import static _13_xml._06_dom.DomProcessor.parseXml;

public class Main {
    public static void main(String[] args) {
        parseXml().forEach(System.out::println);
    }
}
