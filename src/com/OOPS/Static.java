package com.OOPS;
class Student1
{
    static String school;
    String name;
}
public class Static {
    public static void main(String[] args) {
        Student1.school = "RMS/";
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}
