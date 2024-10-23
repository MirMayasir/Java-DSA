package com.OOPS;
class shape
{
    public void area()
    {
        System.out.println("the area is");
    }
}
class triangle extends shape
{
    public void area(int a, int b)
    {
        System.out.println("area is "+ 1/2*a*b);
    }
}
class circle extends shape{
    public void area(int a )
    {
        System.out.println("area is" + 3.14*a*a);
    }
}
public class runtime_poly {
    public static void main(String[] args) {
        triangle c = new triangle();
        c.area(2,4);
    }
}
