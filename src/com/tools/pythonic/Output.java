package com.tools.pythonic;

public class Output {
    public static void print(String text) {
        System.out.print(text);
    }

    public static void print(int num) {
        System.out.print(num);
    }

    public static void print(String text, int num) {
        System.out.print(text + num);
    }

    public static void print(int num, String text) {
        System.out.print(num + text);
    }

    public static void println() {
        System.out.println();
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void println(int num) {
        System.out.println(num);
    }

    public static void println(String text, int num) {
        System.out.println(text + num);
    }

    public static void println(int num, String text) {    //Metodu overload eledim
        System.out.println(num + text);
    }
}
