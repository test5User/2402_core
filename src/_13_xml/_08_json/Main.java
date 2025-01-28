package _13_xml._08_json;

import _13_xml._01_training.CatModel;
import _13_xml._07_jaxb.model.CatAggregator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    //в этом месте мы определяем тип для коллекции параметризованной нашими котами, используем механизм
    //рефлэкшен (но проблема в том, что мы не можем у коллекции вызвать метол .class - поэтому
    // такая сложность). Этот тип мы передаем в метод fromJson для того, чтобы строка превратилась в объект
    public static final Type TYPE = new TypeToken<List<CatModel>>(){}.getType();

    @SneakyThrows
    public static void main(String[] args) {
//        var cats = List.of(
//                new CatModel(1, "Vaska", 2),
//                new CatModel(2, "Murka", 4),
//                new CatModel(3, "Murzik", 1),
//                new CatModel(4, "Shvabra", 5)
//        );
//        var jsonString = GSON.toJson(cats);
//        new FileOutputStream("src/_13_xml/_08_json/cats.json").write(jsonString.getBytes());
        List<CatModel> cats = GSON.fromJson(new FileReader("src/_13_xml/_08_json/cats.json"), TYPE);
        cats.forEach(System.out::println);
    }
}
