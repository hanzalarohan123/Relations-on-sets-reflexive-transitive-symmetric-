package com.company;
public class Question1 {
    public static void main(String[] args)
    {
        int array[][] =
                {       {1, 0, 0},//
                        {0, 1, 0},
                        {0, 0, 1}};

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1)
        {
            System.out.println("matrix is reflexive");
        }
        else if (array[0][0] == 0 && array[1][1] == 0 && array[2][2] == 0)
        {
            System.out.println("matrix is  irreflexive");
        }
        else
        {
            System.out.println("set is not reflexive");
        }
    }

}


