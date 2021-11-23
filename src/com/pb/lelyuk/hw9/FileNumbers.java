//package com.pb.lelyuk.hw9;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {
//------------ метод создания файла -------------------
    static void createNumbersFile (Path path) {

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            String b = new String();
            int c;
            for (int j=0; j<10; j++){
                String a = new String();
                for (int i = 0; i < 10; i++) {
                    c = (int) (Math.random() * 100);
                    a = a + " " + c;
                }
                b = b + a + System.lineSeparator();
            }
//            System.out.println(b); // (проверка построение файла в соответствии с требованиями ДЗ)

            writer.write(b);
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");

    }

    public static void main(String[] args) {

        Path path = Paths.get("E:/Java/HW/numbers.txt");

        createNumbersFile(path);


    }

}
