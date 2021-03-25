package com.tools;

import static com.tools.pythonic.Input.*;
import static com.tools.pythonic.Output.*;
import static com.main.StudentRegistrationDemo.students;

import com.model.Student;

public class StudentTool {

    // melumatlari alaraq qeydiyyatdan kechir
    public static Student registerStudent() {
        String name = input("Ad: ");
        String surname = input("Soyad: ");
        int age = Int(input("Yash: "));
        String className = input("Sinif: ");
        return new Student(name, surname, age, className);
    }

    //qeydiyyatda olanlari print ele
    public static void printRegisteredStudents() {
        if (students == null) {
            println("Hələ heç bir şagird qeydiyyatdan keçməyib.");
        } else {
            String format = "%-12s %-12s %-6s %-8s";
            print("        ");
            System.out.printf((format) + "%n", "Ad", "Soyad", "Yaş", "Sinif");
            for (int i = 0; i < students.size(); i++) {
                print(i + 1 + ". ");
                print("-->  ");
                students.get(i).showInfo();
            }
        }
    }

    // qeydiyyat
    public static void registration() {
        int amountStudents;
        try {
            amountStudents = Int(input("Qeydiyyatdan keçəcək şagird sayı: "));
        } catch (Exception e) {
            println("Şagird sayı ədədlə ifadə olunmalıdır.");
            return;
        }

        int studentListLength = students.size();
        int qeydiyyatNo = 1;
        for (int i = studentListLength; i < studentListLength + amountStudents; i++, qeydiyyatNo++) {
            println(qeydiyyatNo + ". qeydiyyat.");
            students.add(i, registerStudent());
        }
        println();
        println(amountStudents + " şagird uğurla qeydiyyatdan keçdi.");
    }

    // shagirdi tap/axdar
    public static void findStudents() {
        if (students == null) {
            println("Qeydiyyatda shagird yoxdur.");
            println();
            return;
        }
        String word = input("Ad yaxud soyad ile axtarish et.");
        int count = 0;
        for (Student std : students) {
            if (std.getName().toLowerCase().startsWith(word.toLowerCase())
                    || std.getSurname().toLowerCase().startsWith(word.toLowerCase())) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("'" + word + "'" + " haqqinda netice tapilmadi...");
        } else {
            System.out.println("'" + word + "'" + " haqqinda " + count + " netice tapildi:");
            int index = 1;
            for (Student std : students) {
                if (std.getName().toLowerCase().startsWith(word.toLowerCase())
                        || std.getSurname().toLowerCase().startsWith(word.toLowerCase())) {
                    print(index, ". -> ");
                    std.showInfo();
                    index++;
                }
            }
        }
        println();
    }

    public static void updateStudent() {
        if (students == null) {
            println("Qeydiyyatda shagird yoxdur.");
            println();
            return;
        }
        printRegisteredStudents();
        int change;

        try {
            change = Int(input("Deyishiklik etmek istediyiniz shagirdin sira nomresini daxil edin\nLəğv etmək: 0"));
        } catch (Exception e) {
            println("\nYanlış sıra nömrəsi daxil etdiniz.\n");
            return;
        }

        if (change > students.size() || change < 0) {
            println("\nYanlış sıra nömrəsi daxil etdiniz!\n");
            return;
        }
        if (change == 0)
            return;

        println("Neyi deyishmek isteyirsiniz?");
        println("1. Ad.\n"
                + "2. Soyad.\n"
                + "3. Yash.\n"
                + "4. Sinif\n"
                + "5. Hamisini\n"
                + "Ana menyuya qayit ('q' ile) ");
        String selection = input("Neyi deyishmek isteyirsiniz?");

        switch (selection) {
            case "q":
                return;
            case "1":
                students.get(change - 1).setName(input("Yeni adi daxil edin:"));
                break;
            case "2":
                students.get(change - 1).setSurname(input("Yeni soyadi daxil edin:"));
                break;
            case "3":
                students.get(change - 1).setAge(Int(input("Yeni yashi daxil edin:")));
                break;
            case "4":
                students.get(change - 1).setClassName(input("Yeni sinfin adini daxil edin:"));
                break;
            case "5":
                students.set(change - 1, StudentTool.registerStudent());
                break;
            default:
                println("Sechiminiz siyahida yoxdur.");
                break;
        }
    }
}
