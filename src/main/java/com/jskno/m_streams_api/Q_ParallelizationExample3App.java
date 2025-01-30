package com.jskno.m_streams_api;

import com.jskno.m_streams_api.model.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q_ParallelizationExample3App {

    private static final String DIRECTORY = System.getProperty("user.dir") + "/test";

    public static void main(String[] args) throws IOException {

        // create the directory
        Files.createDirectory(Paths.get(DIRECTORY));

        // Generate a large number of Person objects
        List<Person> people = generatePeople(100_000);

        // sequential algorithm
        long start = System.currentTimeMillis();
        people.forEach(Q_ParallelizationExample3App::save);
        System.out.println("Time taken sequential approach: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        people.parallelStream().forEach(Q_ParallelizationExample3App::save);
        System.out.println("Time taken parallel approach: " + (System.currentTimeMillis() - start));

    }

    private static List<Person> generatePeople(int num) {
        return Stream.iterate(0, n -> n + 1)
                .limit(num)
                .map(Person::new)
                .collect(Collectors.toList());
    }

    private static void save(Person person) {
        try (FileOutputStream fos = new FileOutputStream(new File(DIRECTORY + person.id() + ".txt"))) {

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
