
package com.model;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;

    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public void showInfo() {
        StringBuilder sb = new StringBuilder();
//        sb.append(getName()).append(" ").append(getSurname())
//                .append(" ").append(getAge()).append(" ")
//                .append(getClassName());

        String format = "%-12s %-12s %-6d %-8s";
        System.out.printf((format) + "%n",getName(),getSurname(),getAge(),getClassName());
//        System.out.println(sb.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
