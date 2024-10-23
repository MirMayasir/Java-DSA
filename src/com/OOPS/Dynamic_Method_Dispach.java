package com.OOPS;
class Phone
{
    public void showTime()
    {
        System.out.println("the time is 4 pm");
    }
    public void on()
    {
        System.out.println("turning on Phone");
    }
}
class SmartPhone extends Phone
{
    public void music()
    {
        System.out.println("play music");
    }
    public void on()
    {
        System.out.println("turning on smartphone");
    }
}
public class Dynamic_Method_Dispach {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.on();
        obj.showTime();
        obj.music();
    }
}
