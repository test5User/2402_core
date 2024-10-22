package _04_io._02_bais;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Main {
    //Создавали поток из части массива байт и направляли в другой поток, который смотрел на файл
    @SneakyThrows
    public static void main(String[] args) {
//        var bais = new ByteArrayInputStream("Hello мир!!!".getBytes(), 0, 5);
//        var baos = new ByteArrayOutputStream();

//        baos.write(bais.readAllBytes());
//        System.out.println(baos);

//        bais.transferTo(baos);
//        baos.writeTo(new FileOutputStream("src/_04_io/_02_bais/test.ext"));

        new ByteArrayInputStream("Hello мир!!!".getBytes(), 0, 5)
                .transferTo(new FileOutputStream("src/_04_io/_02_bais/test.ext"));
    }
}
