package com.main;

import com.model.Student;
import com.tools.sio.StudentDataReader;

import java.util.ArrayList;
import java.util.List;

import static com.tools.pythonic.Input.input;

public class StudentRegistrationDemo {
    public static List<Student> students = new ArrayList<>();

    public void start() {

        StudentDataReader reader = new StudentDataReader("student_data.txt");

        students = reader.readFromFile();

        while (true) {
            String process;
            StringBuilder sb = new StringBuilder();
            sb.append("*******************************")
                    .append("\nNə etmək istərdiniz?")
                    .append("\n1. Şagird qeydiyyatdan keçir.")
                    .append("\n2. Bütün şagirdləri göstər.")
                    .append("\n3. Şagirdi axtar.")
                    .append("\n4. Şagird məlumatı yenilə(dəyişdir).")
                    .append("\n5. Sıralama prosesi")
                    .append("\n   Çıxmaq üçün  'q' daxil et.")
                    .append("\n*******************************");

            process = input(sb.toString());

            MainProcess.startProcess(process);
        }
    }
}
