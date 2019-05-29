package com.company;


public class Question2
{
    public static void main(String[] args)
    {
        int set[][] ={{1, 1, 1},{1, 0, 1},{1, 1, 0}};

        if(set[0][1]==set[1][0] && set[0][2]==set[2][0] && set[1][2]==set[2][1])
        {
            System.out.println("its symmetric");
        }
        else
        {
            System.out.println("its not symetric");
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
