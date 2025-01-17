package _12_serialization._01_base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var sc = new Scanner(new FileInputStream("src/_12_serialization/_01_base/in.txt"));
             var os = new FileOutputStream("src/_12_serialization/_01_base/out.txt")) {
            while (sc.hasNextLine()) {
                var bytes = sc.nextLine().getBytes();
                os.write(bytes);
                os.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
