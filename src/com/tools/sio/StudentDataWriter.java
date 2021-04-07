package com.tools.sio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.model.Student;

import static com.main.StudentRegistrationDemo.students;

public class StudentDataWriter implements MIStudentWriter {
    private final String PATH;

    public StudentDataWriter(String path)
    {
        this.PATH = path;
    }

    @Override
    public void writeAllToFile(List<Student> students) {
        StringBuilder sb = new StringBuilder();
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(PATH, false)
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
