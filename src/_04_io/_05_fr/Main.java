package _04_io._05_fr;

import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    //записываем файл в 2 этапа, читаем его и вывадим содержиное в консоль
    //как поток символов
    public static final String FILE = "src/_04_io/_05_fr/file.file";

    //append в конструкторе - если true - то данные не стираются, а новые добавляются после существующих
    //если false, то данные записываются заново
    @SneakyThrows
    public static void main(String[] args) {
        try (var fw = new FileWriter(FILE, false);
             var fr = new FileReader(FILE)){
            fw.write("Hello people...");
            fw.append('\n');
            fw.append("and animals..");
            fw.flush();
            var sb = new StringBuilder("This is StringBuilder\n");
            int c;
            while ((c=fr.read()) != -1) {
                //System.out.print((char) c);
                sb.append((char) c);
            }
            System.out.println(sb);
        }
    }
}
