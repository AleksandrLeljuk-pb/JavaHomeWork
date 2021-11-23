package com.pb.lelyuk.hw9;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {

    static void createNumbersFile (Path path) {

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            String a;
            String b;
            for (int i=0; i<10; i++) {
                b = (int) ( Math.random() * 100);
                a = a + b;
            }
            writer.write(String a);
        }

    }

    public static void main(String[] args) {

        Path path = Paths.get("hw9/numbers.txt");



    }

}
