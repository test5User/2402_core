package _04_io._07_file;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;

public class Main {
    //Работа с кдассом File

    @SneakyThrows
    public static void main(String[] args) {
        //Создаем каталог
        var dir = new File("src/_04_io/_07_file/new_dir");
        dir.mkdir();
        //Создаем в этом каталоге файл с неким именем
        var file = new File("src/_04_io/_07_file/new_dir/new file.txt");
        file.createNewFile();
        //Запишем в файл некую строку
        var fw = new FileWriter("src/_04_io/_07_file/new_dir/new file.txt");
        fw.write("Hello world!!!");
        fw.flush();
        //Распечатаем размер файла в байтах
        System.out.println(file.length());
        //Переименуем файл
        var file1 = new File("src/_04_io/_07_file/new_dir/new file.txt");
        file1.renameTo(new File("src/_04_io/_07_file/new_dir/file.txt"));
    }
}
