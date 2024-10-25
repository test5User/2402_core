package _04_io._06_br_sc;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    //считывание файла с помощью объекта BufferedReader
    @SneakyThrows
    public static void main(String[] args) {
        try (var br = new BufferedReader(new FileReader("src/_04_io/_06_br_sc/file.file"))){
            var sb = new StringBuilder();
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str).append("\n");
            }
            System.out.println(sb);
        }
    }
}
