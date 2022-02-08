package com.company;
import java.util.Scanner;
public class Bday_wishes
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scr.nextLine();
        System.out.println("Hello "+name+" Before writing down your age, here is a quick rule for the dare");
        System.out.println("Your age must be in between \"21 to 30\" for completing the dare");
        System.out.println("Now input your age");
        int age = scr.nextInt();
        for (int i = 21; i <=30; i++)
        {
            if (age == 21)
            {
                System.out.println(name+" ! You are DARING");
                break;
            }
            if (age == 22)
            {
                System.out.println(name+" ! You are CARING");
                break;
            }
            if (age == 23)
            {
                System.out.println(name+" ! You are LOVING");
                break;
            }
            if (age == 24)
            {
                System.out.println(name+" ! You are SEXY");
                break;
            }
            if (age == 25)
            {
                System.out.println(name+" ! You are CHARMING");
                break;
            }
            if (age == 26)
            {
                System.out.println(name+" ! You are GENEROUS");
                break;
            }
            if (age == 27)
            {
                System.out.println(name+" ! You are CARELESS");
                break;
            }
            if (age == 28)
            {
                System.out.println(name+" ! You are FREEK");
                break;
            }
            if (age == 29)
            {
                System.out.println(name+" ! You are DISCIPLINED");
                break;
            }
            if (age == 30)
            {
                System.out.println(name+" ! You are ARROGANT");
            }
            else
            {
                System.out.println("please enter age in only given range");
            }
            break;
        }
    }
}
