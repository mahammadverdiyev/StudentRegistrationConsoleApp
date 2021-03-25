package com.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.model.Student;

import static com.main.StudentRegistrationDemo.students;

public class MFileWriter {

    public static void writeToFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName, false)
        )) {
            for (Student student : students) {
                String data = sb.append(student.getName()).append(" ")
                        .append(student.getSurname()).append(" ")
                        .append(student.getAge()).append(" ")
                        .append(student.getClassName()).append("\n").toString();
                writer.write(data);
                sb.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
