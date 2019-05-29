package com.company;

import java.util.Scanner;

public class Question3

{
    public static void main(String[] args)
    {
        int set[][] ={{1, 0, 1},{0, 1, 0},{1, 0, 1}};

        if(set[0][0]==1 && set[0][2]==1 && set[2][0]==1 && set[1][1]==1 && set[2][2]==1)
        {
            System.out.println("transistive");
        }
        else
        {
            System.out.println("not transitive");
        }
        for (int i = 0; i < set.length; i++)
        {
            for (int j = 0; j < set.length; j++)
            {
                System.out.print(set[i][j]+" ");
            }
            System.out.println();
        }
    }

}
