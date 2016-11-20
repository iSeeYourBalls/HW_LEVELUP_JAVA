package com.company;

import java.util.Arrays;

public class Lib {
    //3.Написать программу для вывода на экран всех элементов массива строк через запятую.
    public void outElArr(String [] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public void outElArr2(String [] arr)
    {
        String result = String.join(",", arr);
        System.out.println(result);
    }
    public void outElArr3(String [] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + ", ");
        }
    }

    //4. Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.
    public void outElArrNum (int [] arr)
    {
        for(int i = (arr.length-1); i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }

    //5.Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
    public void fillArr (int [] arr, int step)
    {
        for(int i = 1; i < arr.length; i++)
        {
            arr[i] += arr[(i-1)] + step;
        }

        System.out.println(Arrays.toString(arr));
    }

    //6.Написать программу
    //  для заполнения массива чисел из 10 элементов значениями переменной а,
    // при условии что а является членом арифметической прогрессии 2а-1, а1=4.
    public void fillArrNum (int [] arr)
    {
        int a = 4;

        for(int i = 0; i < arr.length; i++)
        {
            a = 2*a-1;
            arr[i] = a;
        }

        System.out.println(Arrays.toString(arr));
    }
}
