
package com.main;

import static com.main.StudentRegistrationDemo.students;
import static com.tools.pythonic.Output.println;

import com.tools.sio.StudentDataWriter;
import com.tools.StudentTool;


public class MainProcess {
    private static final StudentDataWriter writer =
            new StudentDataWriter("student_data.txt");

    public static void startProcess(String process) {
        switch (process) {
            case "q":
                System.out.println("Programdan chixdiniz.");
                writer.writeAllToFile(students);
                System.exit(0);       //saxla

            case "1":
                StudentTool.registration();
                println();
                break;
            case "2":
                StudentTool.printRegisteredStudents();
                println();
                break;
            case "3":
                StudentTool.findStudents();
                break;
            case "4":
                StudentTool.updateStudent();
                break;
            case "5":
                StudentSortProcess.start();
                break;
            default:
                println("\nDogru emeliyyati secdiyinizden emin olun !\n");
                break;
        }
    }
}
