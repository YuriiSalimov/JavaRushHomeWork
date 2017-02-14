package com.javarush.test.level16.lesson05.task04;

/* Справедливость
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы все мыши ели одновременно.
3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
4. Удали вызов этого метода.
*/

import java.util.concurrent.TimeUnit;

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        Mouse alpha = new Mouse("#1");
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    public static class Mouse extends Thread
    {
        public Mouse(final String name)
        {
            super(name);
            start();
        }

        public void run()
        {
            System.out.println(getName() + " starts eating");
            eating();
            System.out.println(getName() + " finished");
        }
    }

    private static void eating()
    {
        try
        {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
