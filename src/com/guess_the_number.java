package com;
import java.util.*;
class GuessGame
{
    int user;
    int computer;
    int noofguesses =0;
    public GuessGame()
    {
        Random r = new Random();
        computer=r.nextInt(5);
    }
    public int getGame()
    {
        return computer;
    }
    public void user()
    {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
    }
    public int getUser()
    {
        return user;
    }
    public void iscorrectnumber()
    {
        if(user==computer)
        {
            System.out.println("the numbers are same");
        }
        else
        {
            System.out.println("the numbers are not same");
        }
    }

}
public class  guess_the_number {
            public static void main(String[] args) {
                GuessGame gm = new GuessGame();
                int count = 0;
                while(gm.user!=gm.computer)
                {
                    gm.user();
                    gm.iscorrectnumber();
                    count++;
                }
                System.out.println("tyhe number of guesses are " + count);

            }
        }
