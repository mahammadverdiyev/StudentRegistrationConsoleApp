package com.tools.pythonic;

import java.util.Scanner;
import static com.tools.pythonic.Output.*;

/**
 * @author V.Mahammad
 */

public class Input {
    private static Scanner scan = new Scanner(System.in);

    public static String input(String text) {
        println(text);
        return scan.nextLine();
    }

    public static String input() {
        scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int Int(String input) {      // tutaqki :   int n = Int(input("Yashini daxil et: "));
        return Integer.parseInt(input);
    }
}
