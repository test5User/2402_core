package _13_xml._07_jaxb.utils;

import _13_xml._07_jaxb.model.CatAggregator;
import _13_xml._07_jaxb.model.CatJaxb;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class CatJaxbUtils {
    public static final String INPUT_FILE = "src/_13_xml/_04_xsd/cats.xml";
    public static final String OUTPUT_FILE = "src/_13_xml/_07_jaxb/out.xml";

    //создаем метод, который считывает наш xml
    //Для этого мы должны получить контекст. Jaxb работает с нашим аггрегатором - файлом в котором
    //описывается структура нашего xml.
    //После получения контекста мы создаем так называемый анмаршаллер - это объект Jaxb
    //Используя метод анмаршал мы из файла получаем объект аггрегатора (в аггрегаторе уже будет
    // храниться коллекция)
    //и в конце нам достаточно вернуть эту коллецию (для этого есть геттер над полем)
    @SneakyThrows
    public static List<CatJaxb> readFromFile() {
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var unmarshaller = jaxbContext.createUnmarshaller();
        var aggregator = (CatAggregator) unmarshaller.unmarshal(new FileReader(INPUT_FILE));
        return  aggregator.getCats();
    }

    //Для того, чтобы записать чтото в файл, мы передаем это в метод
    //Jaxb работает с нашим аггрегатором, поэтому ма его создаем и запихиваем в него нашу коллекцию
    //Опять же создаем контекст на основе КЛАССА!!! (не объекта)
    //Создаем объект Маршаллер (это объект Jaxb)
    //и используя метод маршал вот это аггрегатор (ОБЪЕКТ с коллекцией) направляем в файл
    @SneakyThrows
    public static void writeToFile(List<CatJaxb> cats) {
        var aggregator = new CatAggregator();
        aggregator.setCats(cats);
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(aggregator, new FileWriter(OUTPUT_FILE));
    }

    public static void print(List<CatJaxb> cats) {
        cats.forEach(System.out::println);
    }
}
