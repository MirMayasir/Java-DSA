package com.OOPS;
abstract class Animal
{
    Animal()
    {
        System.out.println("this is animal class constructor");
    }
    abstract void walk();
}
class Horse extends Animal{
    public void walk()
    {
        System.out.println("horse walks on 4 legs");
    }
    Horse()
    {
        System.out.println("im a horse class constructor");
    }
}
class Chicken extends Animal{
    public void walk()
    {
        System.out.println("chicken walks on 2 legs");
    }
    Chicken()
    {
        System.out.println("ima chicken class constructor");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        //Horse h = new Horse();
        //Chicken c = new Chicken();
        //c.walk();
        //Animal a = new Animal();
    }
}
