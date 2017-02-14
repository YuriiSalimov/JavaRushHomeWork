package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами.
В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value)
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, double n, Integer value)
    {
        printMatrix(m, (int) n, (Object) value);
    }

    public static void printMatrix(short m, int n, Integer value)
    {
        printMatrix((int) m, (double) n, value);
    }

    public static void printMatrix(float m, double n, Integer value)
    {
        printMatrix((int) m, n, value);
    }

    public static void printMatrix(short m, short n, Integer value)
    {
        printMatrix((int) m, (double) n, value);
    }

    public static void printMatrix(float m, double n, String value)
    {
        printMatrix(m, n, Integer.parseInt(value));
    }

    public static void printMatrix(short m, short n, String value)
    {
        printMatrix((int) m, (int) n, value);
    }

    public static void printMatrix(float m, double n, Double value)
    {
        printMatrix(m, n, value.toString());
    }

    public static void printMatrix(short m, short n, Float value)
    {
        printMatrix(m, n, value.toString());
    }
}
