package com.company;

import java.util.Arrays;

public class Lib
{
//       1.Для арифметических операций с большими числами, которые не могут быть
//        представлены в памяти компьютера, используется следующий прием. Каждая
//        цифра таких чисел записывается в отдельный элемент массива, и необходимые
//        операции проводятся с элементами массива цифр. Составить программу
//        выполняющую сложение 20-значных чисел
    public void sumBigNum(String a, String b)
    {
        System.out.println("Задание №1");

        char [] arrA = a.toCharArray();
        char [] arrB = b.toCharArray();


        int sum = 0;
        int sum1 = 0;
        String result = "";

        for(int i = arrB.length-1; i >= 0; i--)
        {
            if(i == 0)
                sum = ((Character.getNumericValue(arrA[i]) + Character.getNumericValue(arrB[i]))+sum1);
            else
                sum = ((Character.getNumericValue(arrA[i]) + Character.getNumericValue(arrB[i]))+sum1)%10;

            sum1 = (Character.getNumericValue(arrA[i]) + Character.getNumericValue(arrB[i]))/10;
            result = sum + result;
        }

        System.out.println(result);
    }
//       2.Дан массив целых чисел. Найти:
//        а) номер первого нечетного элемента. Если нечетных элементов в массиве нет,
//        то должно быть напечатано соответствующее сообщение;
    public void searchArrFirstEl (int [] arr)
    {
        System.out.println("\nЗадание №2 пункт А");

        boolean check = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 1)
            {
                System.out.println("Номер первого нечетного елемента - " + i);
                check = true;
                break;
            }
        }
        if(check == false)
            System.out.println("Нечетный елемент не найден!");
    }
//       2.Дан массив целых чисел. Найти:
//        б) номер первого элемента, кратного числу 13. Если таких элементов в массиве
//        нет, то должно быть напечатано соответствующее сообщение.
    public void searchArr13El (int [] arr)
    {
        System.out.println("\nЗадание №2 пункт Б");

        boolean check = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0 && arr[i]%13 == 0)
            {
                System.out.println("Номер первого елемента кратный 13 - " + i);
                check = true;
                break;
            }
        }
        if(check == false)
            System.out.println("Елемент кратный 13 не найден!");
    }
//    3.Известен рост 30 учеников школы. Сколько из них имеет рост больше 170
//    см? Можно ли сформировать баскетбольную команду (в команде должно быть
//    не менее пяти человек ростом больше 170 см)?

    public void basketTeam (int arr[])
    {
        System.out.println("\nЗадание №3");

        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 170)
                count++;
        }

        System.out.println("Количество с ростом больше 170 см = "+ count);

        if(count >= 5)
            System.out.println("Количество студентов с ростом больше 170 позволяет создать команду");
    }
//    4) В массиве хранится информация о росте 35 человек. Определить, сколько
//    человек имеют самый большой рост. * Задачу решить, не используя два прохода
//    по массиву.
    public void maxManHeight (int arr [])
    {
        System.out.println("\nЗадание №4");
        int max = 0;
        int count = 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max) {
                max = arr[i];
                count = 1;
            }
            else
                count++;

        }

        System.out.println("Людей с наибольшим ростом : " + count);
    }
//    5) В массиве хранится информация о годе рождения каждого из 30 человек.
//        Определить, на сколько лет возраст самого старого человека превышает возраст
//    самого молодого. При определении возраста учитывать только год рождения
//        (месяц и день не учитывать). * Задачу решить, не используя два прохода по
//    массиву
    public void oldVSYoung (int arr [])
    {
        System.out.println("\nЗадание №5");
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }

            if(min == 0)
                min = max;
            else if(min > arr[i])
                min = arr[i];
        }

        int result = max - min;
        String text = " лет.";

        if(result%10 == 1 && result%10 != 0)
            text = " год.";
        else if(result%10 <=4 && result%10 != 0)
            text = " года.";

        System.out.println("Возраст самого старого превышает молодого на "+result+text);
    }
    //Вариант без цикла
    public void oldVSYoung2 (int arr [])
    {
        System.out.println("\nЗадание №5_2");
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        int result = max - min;
        String text = " лет.";

        if(result%10 == 1 && result%10 != 0)
            text = " год.";
        else if(result%10 <=4 && result%10 != 0)
            text = " года.";

        System.out.println("Возраст самого старого превышает молодого на "+result+text);
    }
}
