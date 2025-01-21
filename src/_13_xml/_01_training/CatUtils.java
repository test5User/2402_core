package _13_xml._01_training;

import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@UtilityClass
public class CatUtils {
    public static final String PATH_TO_FILE = "src/_13_xml/_01_training/input.csv";

    public static List<CatModel> extractFromFile() {
        var cats = new ArrayList<CatModel>();
        //Scanner нужно закрывать, поэтому try-with-resources
        try (var sc = new Scanner(new FileReader(PATH_TO_FILE))){
            while (sc.hasNextLine()) {
                try {
                    //getInstance - пробрасывает наше исключение, поэтому ловим его
                    cats.add(CatFactory.getInstance(sc.nextLine()));
                } catch (TxtLineException e) {
                    //e - вызывается toString нашего инсключения.. а потом добавляем
                    //причину(т.е. сообщение из методов валидации )
                    System.err.println(e + ", Message: " + e.getCause().getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        return cats;
    }

    public static void printCats(List<CatModel> cats) {
        cats.forEach(System.out::println);
    }
}
