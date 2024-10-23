package com.OOPS;
interface Animal2
{
    void walk();
}
interface Herbivore
{
    void eatsGrass();
}
class Horse2 implements Animal2,Herbivore
{
    public void walk()
    {
        System.out.println("horse walks on 4 legs");
    }
    public void eatsGrass()
    {
        System.out.println("horse eats grass only");
    }

}
public class Interfaces {
    public static void main(String[] args) {
        Horse2 h = new Horse2();
        h.walk();
        h.eatsGrass();
    }
}
