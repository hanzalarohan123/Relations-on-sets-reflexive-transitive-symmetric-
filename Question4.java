package com.company;

import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many elements do u want to add");
        int size=scan.nextInt();
        System.out.println("The relations will make of set with N elemets is "+(int)Math.pow(2,(size*size)));

    }


}
