package com.tools;

import com.model.Student;

import java.util.Comparator;

import static com.main.StudentRegistrationDemo.students;


public class StudentSorter {
    public static void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void sortBySurname() {
        students.sort(Comparator.comparing(Student::getSurname));
    }

    public static void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public static void sortByClassName() {
        students.sort(Comparator.comparing(Student::getClassName));
    }
}
