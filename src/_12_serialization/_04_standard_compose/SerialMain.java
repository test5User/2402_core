package _12_serialization._04_standard_compose;

import _12_serialization._02_standard.Monkey;

import java.io.*;
import java.util.List;

import static _12_serialization._02_standard.MainMonkey.PATH_TO_FILE;

public class SerialMain {

    public static void main(String[] args) {
        var vaska = new SerialCat("Vaska", new SerialBox(List.of("Mouse", "Bird")));
        System.out.println(vaska);

        try (var os = new FileOutputStream(PATH_TO_FILE);
             var oos = new ObjectOutputStream(os);
             var is = new FileInputStream(PATH_TO_FILE);
             var ois = new ObjectInputStream(is)
             ) {

            oos.writeObject(vaska);

            SerialCat.STATIC_FIELD = "new value";

            var fromFile = (SerialCat) ois.readObject();
            System.out.println(fromFile);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
