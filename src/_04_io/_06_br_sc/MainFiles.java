package _04_io._06_br_sc;

import lombok.SneakyThrows;

import javax.imageio.stream.FileCacheImageInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainFiles {
    //считывание файла с помощью средств из пакета nio (Files, Paths, Path)
    @SneakyThrows
    public static void main(String[] args) {
        //получаем объект типа path
        var path = Paths.get("src/_04_io/_06_br_sc/file.file");
        //с помощью класса Files считываем все строки, передавая в метод в качестве аргумента path
        //и печатаем это
        System.out.println(String.join("\n", Files.readAllLines(path)));
    }
}
