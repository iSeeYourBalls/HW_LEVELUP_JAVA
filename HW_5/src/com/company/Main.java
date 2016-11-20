package com.company;

public class Main {

    public static void main(String[] args)
    {
        Lib program = new Lib();
        //1. Вывести на экран возрастающую последовательность из 10 чисел начиная с 15.
        for(int i = 15; i < 25; i++)
        {
            System.out.println(i);
        }
        //2.Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15.
        System.out.println("\nЗадание №2 ----------------");

        int a;

        for(int i = 33; i > 15; i--)
        {
            a = i % 2 == 1? i : 0;
            System.out.println(a);
        }

        for(int i = 33; i > 15; i-=2)
        {
            System.out.println(i);
        }

        //3.Написать программу для вывода на экран всех элементов массива строк через запятую.
        System.out.println("\nЗадание №3 ----------------");

        String [] arr = {"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};
        program.outElArr(arr);
        program.outElArr2(arr);
        program.outElArr3(arr);

        //4. Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.
        System.out.println("\nЗадание №4 ----------------");
        int [] arrNum = {1,2,3,4,5,6,7,8,9,10};
        program.outElArrNum(arrNum);

        //5.Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
        System.out.println("\nЗадание №5 ----------------");

        int [] arrNum20 = new int [20];
        int step = 3;
        arrNum20[0] = 5;

        program.fillArr(arrNum20, step);

        //6.Написать программу
        //  для заполнения массива чисел из 10 элементов значениями переменной а,
        // при условии что а является членом арифметической прогрессии 2а-1, а1=4.
        System.out.println("\nЗадание №6 ----------------");

        int [] arrNum10 = new int [10];
        program.fillArrNum(arrNum10);

        //7. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.
        System.out.println("\nЗадание №7 ----------------");
        int sum = 0;
        for( int num : arrNum10) {
            sum += num;
        }
        boolean checkSumArr = sum > 0 ? true:false;
        System.out.println("Cумма элементов массива есть неотрицательное число? "+checkSumArr);

        //8.Дан массив чисел. Используя тернарный оператор определить:
        //а) максимальный элемент;
        //б) минимальный элемент;
        //в) на сколько максимальный элемент больше минимального;
        //г)  индекс максимального элемента;
        //д) индекс минимального и индекс максимального элементов.
        System.out.println("\nЗадание №8 ----------------");

        int check = 0;
        int maxNum = arrNum[0];
        //а) максимальный элемент
        for (int i = 0; i < arrNum.length; i++)
        {
            check = maxNum < arrNum[i] ? maxNum = arrNum[i]: maxNum;
        }
        //б) минимальный элемен;
        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++)
        {
            check = min > arrNum[i] ? min = arrNum[i]: min;
        }
        //в) на сколько максимальный элемент больше минимального;
        int diff = maxNum != min ? maxNum - min : 0;

        //г)  индекс максимального элемента;
        int indexMax = 0;
        for (int i = 0; i < arrNum.length; i++)
        {
            check = maxNum ==arrNum[i] ? indexMax = i: maxNum;
        }

        int indexMin = 0;
        for (int i = 0; i < arrNum.length; i++)
        {
            check = min == arrNum[i] ? indexMin = i: min;
        }


        System.out.println("максимальный элемент - " + maxNum);
        System.out.println("минимальный элемент - "+ min);
        System.out.println("на сколько максимальный элемент больше минимального - "+ diff);
        System.out.println("индекс максимального элемента - " + indexMax);
        System.out.println("индекс максимального элемента - " + indexMin);


    }
}
