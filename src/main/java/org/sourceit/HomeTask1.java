package org.sourceit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven (int number)
    {
        return number %2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse (double a, double b)
    {
        if (a < 0 || b < 0) {
            return 0;
        }
        double hip =0;
        hip = Math.sqrt(a*a + b*b);
        return hip;

    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter (double a, double b, double c)
    {
        double per = 0;
        per = a + b + c;

        return per;
            }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area (double a, double b) {

        double area = 0;
       if(a < 0 || b < 0){
           return 0;
       }
        area = (1 / 2) * a * b;

        return area;
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max)
    {
        max -= min;
        int rand = (int) (Math.random()*(max) + min);

        return rand;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number)
    {
        long summa = 0;


        if(number > 0){
            while (number > 0){
                summa += number % 10;
                number = number / 10;
            }        }
        else if (number < 0){

            while (number < 0){
                summa += number % 10;
                number=number / 10;
            }
        }

        return Math.abs(summa);

    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till)
    {
        if (till < 0){
            return 1;
        }

        int a1 = 1;
        int a2 = 1;
        int fibon = 0;
        int b = 2;

        while (b <= till){
            fibon = a1 + a2;
            a1 = a2;
            a2 = fibon;
            b++;
        }
        return fibon;
            }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket)
    {
        long a1 = ticket / 100;
        long a2 = ticket % 100;
        long luck = calculateSum(a1);
        long luck1 = calculateSum(a2);

        if (luck == luck1){
            return true;
        }
        return false;
    }
}
