package com.tools.sio;
import com.model.Student;
import java.util.List;

public interface MIStudentWriter {
    void writeAllToFile(List<Student> studentList);
}
