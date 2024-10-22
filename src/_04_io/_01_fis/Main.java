package _04_io._01_fis;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Main {
    //записываем массив байт а файл, читаем файл и выводим содержиное в файл и в консоль
    //второй код - побайтная печать массива байт

    public static final String TEST_EXT = "src/_04_io/_01_fis/test.ext";
    public static final String TEST_1_EXT = "src/_04_io/_01_fis/test1.ext";

    @SneakyThrows
    public static void main(String[] args) {
        try (var fos = new FileOutputStream(TEST_EXT);
             var fis = new FileInputStream(TEST_EXT);
             var fos1 = new FileOutputStream(TEST_1_EXT)){
            var outByteArray = "Hello мир!!!".getBytes();
//            fos.write(outByteArray);
//
//            byte[] bytes = fis.readAllBytes();
//            System.out.println(new String(bytes));
//            fos1.write(bytes);
            for (byte item : outByteArray) {
                System.out.print((char) item);
            }
        }
    }
}
