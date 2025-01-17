package _12_serialization._02_standard;

import java.io.*;

public class MainMonkey {
    public static final String PATH_TO_FILE = "src/_12_serialization/_02_standard/save.sav";
    public static void main(String[] args) {
        //Создаем объект типа Monkey и печатаем его
        var monkey = new Monkey("Anfisa", 5, "Banana");
        System.out.println(monkey);
        //попытаемся его сериализовать (превратить в поток байт) и
        //записать этот поток в файл
        //Потом считать данные из файла и превратить их в объект
        try (var os = new FileOutputStream(PATH_TO_FILE);
             var oos = new ObjectOutputStream(os);
             var is = new FileInputStream(PATH_TO_FILE);
             var ois = new ObjectInputStream(is)) {

            //метод writeObject превращает объект в поток байт и пишет его в
            //outputStream
            oos.writeObject(monkey);

            //считаем данные из файла и сделаем объект
            var monkeyFomFile = (Monkey) ois.readObject();
            System.out.println(monkeyFomFile);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
