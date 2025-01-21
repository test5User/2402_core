package _12_serialization._05_extended;

import _12_serialization._04_standard_compose.SerialCat;

import java.io.*;

import static _12_serialization._02_standard.MainMonkey.PATH_TO_FILE;

public class Main {
    public static void main(String[] args) {
        try (var os = new FileOutputStream(PATH_TO_FILE);
             var oos = new ObjectOutputStream(os);
             var is = new FileInputStream(PATH_TO_FILE);
             var ois = new ObjectInputStream(is)
        ) {
            //Создаем объект
            var extendedObject = new ExtendedClass("Vasia", "Pupkin", "P@$$w0Rd");
            System.out.println(extendedObject);

            //Сохраняем его в файл
            oos.writeObject(extendedObject);

            System.out.println("___________________________________________");

            //Считываем из файла
            var fromFile = (ExtendedClass) ois.readObject();
            System.out.println(fromFile);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
