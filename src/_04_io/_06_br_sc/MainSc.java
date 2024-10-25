package _04_io._06_br_sc;

import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Scanner;

public class MainSc {
    //считывание файла с помощью объекта Scanner
    @SneakyThrows
    public static void main(String[] args) {
        try (var sc = new Scanner(new FileReader("src/_04_io/_06_br_sc/file.file"))){
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
    }
}
