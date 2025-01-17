package _12_serialization._01_base;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        try (var rd = new BufferedReader(new FileReader("src/_12_serialization/_01_base/in.txt"));
             var strStream = rd.lines();
             var os = new FileOutputStream("src/_12_serialization/_01_base/out.txt")) {

            var outStr = strStream.collect(Collectors.joining("\n"));
            os.write(outStr.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
