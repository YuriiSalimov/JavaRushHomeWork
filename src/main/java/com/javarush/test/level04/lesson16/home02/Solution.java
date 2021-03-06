package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;

/**
 * Среднее такое среднее
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        System.out.println(middle(a, b, c));
    }

    private static int middle(int a, int b, int c) {
        return isMiddle(a, b, c) ? a : middle(b, c, a);
    }

    private static boolean isMiddle(int mid, int min, int max) {
        return (mid >= min) && (mid <= max);
    }
}
