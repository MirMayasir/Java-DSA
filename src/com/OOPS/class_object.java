package com.OOPS;
class pen
{
    String type;
    String color;
    public void write()
    {
        System.out.println("writting somethethig");
    }
    public void printColour()
    {
        System.out.println(this.color);
    }
}
class Student
{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(name);
        System.out.println(age);
    }
    Student(Student s2)
    {
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(String name , int age)
    {
        this.age = age;
        this.name = name;
    }
}
public class class_object {
    public static void main(String[] args) {
       Student s1 = new Student("mayasir",22);

       Student s2 = new Student(s1);
      // s2.printInfo();
        System.out.println(s2.name);
        System.out.println(s2.age);
        byte a = 30;
    }

}
