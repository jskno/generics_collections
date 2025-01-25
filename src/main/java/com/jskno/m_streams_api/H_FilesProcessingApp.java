package com.jskno.m_streams_api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class H_FilesProcessingApp {

    public static void main(String[] args) throws IOException {
        String path = "/home/jskno/projects/courses/jsknoGithub/generics_collections/src/main/java/com/jskno/m_streams_api/model/names";
        Stream<String> names = Files.lines(Paths.get(path));
        names.forEach(System.out::println);

        List<String> namesList;
        try (Stream<String> names2 = Files.lines(Paths.get(path))) {
            namesList = names2
                    .filter(s -> s.startsWith("A"))
                    .toList();
        }
        namesList.forEach(System.out::println);
    }
}
