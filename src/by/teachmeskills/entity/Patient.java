package by.teachmeskills.entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Patient {
    private String name;
    private int age;
    public static final String FILE_NAME = "names.txt";

    public Patient() {
        name = randomName();
        age = randomAge();
    }

    private String randomName() {
        List<String> names = null;
        try {
            names = Files.readAllLines(Paths.get("names.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names.get(new Random().nextInt(names.size()));
    }


    private int randomAge(){
        return new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
