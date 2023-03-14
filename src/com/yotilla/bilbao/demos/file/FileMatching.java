package com.yotilla.bilbao.demos.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMatching {

    public static void main(String[] args) throws IOException {
        final Path firstFilePath = Files.createTempFile("first", "txt");
        final Path secondFilePath = Files.createTempFile("second", "txt");
        final Path thirdFilePath = Files.createTempFile("third", "txt");

        Files.writeString(firstFilePath, "Content of the first file");
        Files.writeString(secondFilePath, "Content of the second file");
        Files.writeString(thirdFilePath, "Content of the first file but longer");

        System.out.println(Files.mismatch(firstFilePath, secondFilePath));
        System.out.println(Files.mismatch(firstFilePath, thirdFilePath));
        System.out.println(Files.mismatch(firstFilePath, firstFilePath));

    }
}
