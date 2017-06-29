package com.db.edu.chat;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        File path = new File("a.txt");
        if (!path.canRead()) throw new IllegalArgumentException();


        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                    new BufferedInputStream(
                        new FileInputStream(path)),"UTF-8") )) {

            bufferedReader.readLine();

        } catch (IOException e) {

        }
    }
}
