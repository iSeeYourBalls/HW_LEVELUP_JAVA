package com.company;

import java.util.Arrays;

public class Lib {
    /*
    1) Известно, что лошади путешествуют в уникальной модели - они скачут(на
    максимальной скорости) или отдыхают(стоя на месте). Вот пример того, как
    одна конкретная лошадь может путешествовать:
    Лошадь Blaze может скакать со скоростью 14 м/с в течение 60 секунд, но затем
    должна отдохнуть в течение 45 секунд. Через 500 секунд Blaze преодолеет
    расстояние в 4200 метров.
    Написать программу для вычисления расстояния, которое пройдет лошадь за
    определенный промежуток времени, при следующих входных параметрах:
    totalTime - Время путешествия (сек)
    runTime - Время, которое лошадь может бежать на максимальной скорости (сек)
    restTime - Время, которое необходимо лошади на отдых (сек)
    speed - Максимальная скорость лошади (м/с)
     */
    public void horse(int totalTime, int runTime, int restTime, int speed)
    {
        System.out.println("Задание №1 -------------");

        int sum = 0;

        int result = totalTime/(runTime+restTime);
        if(totalTime%(runTime+restTime) >= runTime)
            result++;

        for(int i = 0; i < result;i++)
        {
            sum += runTime*speed;
        }

        System.out.println(sum);
    }
    /*
    2) Дана строка. Написать программу, которая преобразовывает символы из
    нижнего регистра в верхний и наоборот. Например: ТЕкст нАпиСАннЫй С
    рАзныМ РегиСТроМ => теКСТ НаПИсаННыЙ с РаЗНЫм рЕГИстРОм.
     */
    public void someString(String s)
    {
        System.out.println("\nЗадание №2 -------------");

        System.out.println(s);
        for (char arr : s.toCharArray())
        {
            if(Character.isLowerCase(arr))
                arr = Character.toUpperCase(arr);
            else if(Character.isUpperCase(arr))
                arr = Character.toLowerCase(arr);



            System.out.print(arr);
        }
    }

    /*
    3) Дана строка. Написать программу, которая сортирует все символы в строке в
       порядке возрастания. Например: "hello world" => " dehllloorw».
     */

    public void sortWord(String someString)
    {
        System.out.println("\n\nЗадание №3 -------------");

        char [] arr = someString.toCharArray();
        Arrays.sort(arr);

        StringBuilder builder = new StringBuilder();
        builder.append(arr);

        System.out.println(builder.toString());
    }
    /*
    4) Скорость первого автомобиля v1 км/ч, второго — v2 км/ч, расстояние между
    ними s км. Какое расстояние будет между ними через t ч, если автомобили
    движутся в разные стороны?
     */
    public void carSpeed(int firstCarSpeed, int secondCarSpeed, int distance, int hours)
    {
        System.out.println("\n\nЗадание №4 -------------");

        int result = distance;

        for(int i = 0; i < hours; i++)
        {
            result += firstCarSpeed+secondCarSpeed;
        }

        System.out.println(result);
    }

    /*
    5) Отсортировать массив пузырьком (Bubble).
     */
    public static void bubbleSort(int[] arr){
    System.out.println("\n\nЗадание №5 -------------");
    for(int i = arr.length-1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if( arr[j] > arr[j+1] )
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    6) Дано трехзначное число (0-999). Необходимо написать программу, которая
//    вернет строковое представление данного числа. Например, дано число 738, его
//    строковое представление - seven hundred thirty eight.
    //Это задание я выполнил в 8 ДЗ в доп задании, дублировать не стал.
}
