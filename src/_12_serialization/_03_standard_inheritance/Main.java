package _12_serialization._03_standard_inheritance;

import _12_serialization._02_standard.Monkey;

import java.io.*;

import static _12_serialization._02_standard.MainMonkey.PATH_TO_FILE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creation....");
        var child = new Child(1);

        try (var os = new FileOutputStream(PATH_TO_FILE);
             var oos = new ObjectOutputStream(os);
             var is = new FileInputStream(PATH_TO_FILE);
             var ois = new ObjectInputStream(is)) {
            System.out.println("Serialization....");
            oos.writeObject(child);

            System.out.println("DeSerialization....");
            var childFromFile = (Child)ois.readObject();

            System.out.println(childFromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
