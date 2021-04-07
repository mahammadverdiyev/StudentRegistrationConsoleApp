package com.tools.sio;

import com.model.Student;

import static com.tools.pythonic.Input.Int;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDataReader implements MIStudentReader {

    private final String PATH;

    public StudentDataReader(String path) {
        this.PATH = path;
    }

    @Override
    public List<Student> readFromFile() {
        List<Student> studentList = new ArrayList<>();
        File file = new File(PATH);

        try {
            boolean fileDoesExist = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;
            String[] data;

            while ((line = reader.readLine()) != null) {
                data = line.split(" ");
                studentList.add(new Student(data[0], data[1], Int(data[2]), data[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
