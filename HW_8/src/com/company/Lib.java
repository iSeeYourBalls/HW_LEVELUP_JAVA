package com.company;

import java.util.Arrays;

public class Lib {

    /*
    1.Найти среднее арифметическое элементов массива, больших числа 10. * Решить задачу при помощи циклов while и for-each
     */
    public void searchMiddleNumOne(int [] arr)
    {
        System.out.println("Задание №1 -------");
        double sum = 0.0;
        int count = 0;

        for(int num : arr)
        {
            if(num > 10)
            {
                sum += num;
                count++;
            }
        }

        double result = sum / count;

        System.out.println(result);

    }
    /*
    2.Найти среднее арифметическое элементов массива, меньших некоторого числа m. * Решить задачу при помощи циклов while и for-each
     */
    public void searchMiddleNumTwo(int [] arr)
    {
        System.out.println("\nЗадание №2 -------");
        double sum = 0.0;
        int count = 0;
        int m = 50;

        for(int num : arr)
        {
            if(num < m)
            {
                sum += num;
                count++;
            }
        }

        double result = sum / count;

        System.out.println(result);
    }

    /*
    3. В массиве из 20 элементов числа образуют неубывающую последовательность.
    Несколько элементов, идущих подряд, равны между собой. Найти количество таких элементов. Сколько различных чисел имеется в массиве?
     */
    public void searchCountEl (int [] arr)
    {
        System.out.println("\nЗадание №3 -------");
        Arrays.sort(arr);

        int check = 0;
        int count = 0;
        int diff = 0;
        int result = 0;

        for(int num : arr)
        {
            if(check == num)
                count++;
            else
                diff++; //Кол-во чисел учитывая одного из тех кто повторяется.

            check = num;
            result = diff - count; //Кол-во разночисленных без учета парных.
        }
        System.out.println("Равных между собои : " + count + " Различных чисел : " + diff);
    }
    /*
    4.В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилеи
    ̆. Определить скорости двух самых быстрых автомобилей. * Задачу решить, не используя два прохода по массиву.
     */
    public void searchMaxSpeed(int arr [])
    {
        System.out.println("\nЗадание №4 -------");

        int max = 0;
        int max2 = 0;

        for(int speed : arr)
        {
            if(max < speed)
                max = speed;
            else if (max2 < speed && max2!= max) //можно без && max2!= max, но есть шанс что значения елементов могут повторится и получится два самых быстрых с одинаковой скоростью
                max2 = speed;
        }

        System.out.println("Скорость первого самого быстрого - "+ max + " Скорость второго самого быстрого - " + max2);
    }

    /*
    5.Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    а) сумму всех чисел последовательности;
    б) количество всех чисел последовательности.
     */
    public void searchNotNullArr(int [] arr)
    {
        System.out.println("\nЗадание №5 -------");

        int sum = 0;

        for(int num : arr)
        {
            sum += num;
        }

        System.out.println("Сумма : "+sum + ", количество : " + arr.length);
    }
    /*
    6.Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа.
    Определить, какое количество отрицательных чисел записано в начале последовательности.
    Условный оператор не использовать.
     */
    public void searchNegativeNum(double [] arr)
    {
        System.out.println("\nЗадание №6 -------");
        System.out.println(Arrays.toString(arr));
        int count = 0;

        while(arr[count] < 0)
        {
            count++;
        }

        System.out.println(count);
    }

    /*
    7.Дано натуральное число.
    Определить, сколько раз в нем встречается максимальная цифра
    (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1).
    * Задачу решить, не используя два прохода по массиву.
     */
    public void countMaxNum (int num)
    {
        System.out.println("\nЗадание №7 -------");
        int curNum = 0;
        int result = 0;
        int count = 0;

        while(true)
        {
            curNum = num%10;

            if(result == curNum)
                count++;
            else if (result < curNum) {
                result = curNum;
                count = 1;
            }

            num /= 10;

            if(curNum == 0)
                break;
        }

        System.out.println(count);
    }
    /*
    8.Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.
     */

    public void numMirror(int num)
    {
        System.out.println("\nЗадание №8 -------");
        int result = 0;

        while(num > 0)
        {
            result = result * 10 + num % 10;
            num /= 10;
        }
        System.out.println(result);

    }

    //8.2 Это решение нашел в интернете
    public int numMirror2(int num){
        return num < 10 ? num:Integer.parseInt(String.valueOf(num%10)+numMirror2(num / 10));
    }

    /*
        9.Дано двузначное число.
        Необходимо написать программу, которая вернет строковое представление данного числа.
        Например, дано число 34, его строковое представление - thirty four.
     */

    public void returnNameNum (int num)
    {
        System.out.println("\nЗадание №9 -------");

        StringBuilder builder = new StringBuilder();
        int first = num;

        if(num/10 > 1)
            first = num / 10 * 10;

        int i = 0;

        while(i < 2) {

            switch (first) {
                case 0:
                    builder.append("ноль");
                    break;
                case 1:
                    builder.append("один");
                    break;
                case 2:
                    builder.append("два");
                    break;
                case 3:
                    builder.append("три");
                    break;
                case 4:
                    builder.append("четыре");
                    break;
                case 5:
                    builder.append("пять");
                    break;
                case 6:
                    builder.append("шесть");
                    break;
                case 7:
                    builder.append("семь");
                    break;
                case 8:
                    builder.append("восемь");
                    break;
                case 9:
                    builder.append("девять");
                    break;
                case 10:
                    builder.append("десять");
                    break;
                case 11:
                    builder.append("одиннадцать");
                    break;
                case 12:
                    builder.append("двенадцать");
                    break;
                case 13:
                    builder.append("тринадцать");
                    break;
                case 14:
                    builder.append("четырнадцать");
                    break;
                case 15:
                    builder.append("пятнадцать");
                    break;
                case 16:
                    builder.append("шеснадцать");
                    break;
                case 17:
                    builder.append("семнадцать");
                    break;
                case 18:
                    builder.append("восемнадцать");
                    break;
                case 19:
                    builder.append("девятнадцать");
                    break;
                case 20:
                    builder.append("двадцать");
                    break;
                case 30:
                    builder.append("тридцать");
                    break;
                case 40:
                    builder.append("сорок");
                    break;
                case 50:
                    builder.append("пятдесят");
                    break;
                case 60:
                    builder.append("шестьесят");
                    break;
                case 70:
                    builder.append("семьдесят");
                    break;
                case 80:
                    builder.append("восемьдесят");
                    break;
                case 90:
                    builder.append("девянносто");
                    break;
                default:
                    builder.append("Ошибка");
            }

            if(i == 0 && num/10 > 1 && num%10 > 0)
            {
                first = num % 10;
                i++;
                builder.append(" ");
            }
            else
                i = 2;
        }
        System.out.println(builder.toString());
    }
    /*
    10.Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
     */
    public void spotMarkStudents(int rating)
    {
        System.out.println("\nЗадание №10 -------");

        String mark = "";

        if(rating <= 19) // Можно тернарный, но if как то больше по душе
            mark = "F";
        else if(rating >= 20 && rating <= 39)
            mark = "E";
        else if(rating >= 40 && rating <= 59)
            mark = "D";
        else if(rating >= 60 && rating <= 74)
            mark = "C";
        else if(rating >= 75 && rating <= 89)
            mark = "B";
        else if(rating >= 90 && rating <= 100)
            mark = "A";

        System.out.println("Оценка - " + mark);
    }

}
