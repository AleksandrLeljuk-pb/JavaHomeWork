//package com.pb.lelyuk.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {
//------------ метод создания файла -------------------
    static void createNumbersFile (Path path1) {

        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            String b = new String();
            int c;
            for (int j=0; j<10; j++){
                String a = new String();
                for (int i = 0; i < 10; i++) {
                    c = (int) (Math.random() * 100);
                    a = c + " " + a;
                }
                b = b + a + System.lineSeparator();
            }
//            System.out.println(b); // (проверка построение файла в соответствии с требованиями ДЗ)

            writer.write(b);
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path1.toAbsolutePath() + "\" done!");

    }

    static void createOddNumbersFile (Path path1) {
        try (BufferedReader reader = Files.newBufferedReader(path1)) {
            String line;
            

            while ((line = reader.readLine()) != null) {
                String[] subLine = line.split(" ");
                int[] numSubLine = new int[subLine.length];
                int i = 0;
                for (String s : subLine) {
                    numSubLine[i] = Integer.parseInt(s);
                    if (numSubLine[i] % 2 == 0) {
                        System.out.println(numSubLine[i] + " ");
                        i++;
                    } else {
                        subLine[i] = "0";
                        System.out.println(numSubLine[i] + " ");
                        i++;
                    }
                }
                line = String.join(" ", subLine);

                System.out.println(line);
                
                Path path2 = Paths.get("E:/Java/HW/src/odd-numbers.txt");
                BufferedWriter writer2 = Files.newBufferedWriter(path2);    
                writer2.write(line);
                writer2.close();
            }

        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }

    }



    public static void main(String[] args) {

            Path path1 = Paths.get("E:/Java/HW/src/numbers.txt");

            createNumbersFile(path1);

            createOddNumbersFile(path1);
        }
}
