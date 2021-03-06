package com.javarush.test.level03.lesson08.task05;

import java.util.Scanner;

/**
 * Чистая любовь
 * Ввести с клавиатуры три имени, вывести на экран надпись:
 * name1 + name2 + name3 = Чистая любовь, да-да!
 * Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String message = "%s + %s + %s = Чистая любовь, да-да!";
        final Scanner scanner = new Scanner(System.in);
        final String name1 = scanner.nextLine();
        final String name2 = scanner.nextLine();
        final String name3 = scanner.nextLine();
        System.out.println(String.format(message, name1, name2, name3));
    }
}