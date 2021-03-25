package com.main;

import com.tools.StudentTool;
import com.tools.pythonic.Input;
import com.tools.StudentSorter;

import static com.tools.pythonic.Output.println;

public class StudentSortProcess {
    public static void start() {
        printAllSortingTypes();
        String sortType = Input.input("Neye gore siralamaq isteyirsiniz?");
        switch (sortType) {
            case "q":
                return;
            case "1":
                StudentSorter.sortByName();
                break;
            case "2":
                StudentSorter.sortBySurname();
                break;
            case "3":
                StudentSorter.sortByAge();
                break;
            case "4":
                StudentSorter.sortByClassName();
                break;
            default:
                println("Sechiminiz siyahida yoxdur.");
                break;
        }
        StudentTool.printRegisteredStudents();
    }

    private static void printAllSortingTypes() {
        StringBuilder sb = new StringBuilder();
        sb.append("*******************************")
                .append("\n1. Ad")
                .append("\n2. Soyad")
                .append("\n3. Yaş")
                .append("\n4. Sinif adı")
                .append("\n   'q'  ilə ana menuya qayıt.")
                .append("\n*******************************");
        println(sb.toString());
    }
}
