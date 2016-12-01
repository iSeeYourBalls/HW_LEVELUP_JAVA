package com.company;

public class Lib {
    //1.Определить какой четверти принадлежит точка с координатами (х,у)
    public void getCoord (int x, int y)
    {
        System.out.println("Задание №1 -------------");
        if(x > 0 && y > 0)
            System.out.println("1-я четверть");
        else if(x < 0 && y > 0)
            System.out.println("2-я четверть");
        else if(x < 0 && y < 0)
            System.out.println("3-я четверть");
        else if(x > 0 && y < 0)
            System.out.println("4-я четверть");
        else
            System.out.println("Точка находится в центре");
    }
    //2.Найти суммы только положительных из трех чисел
    public void searchPosNum (int first, int second, int last)
    {
        System.out.println("\nЗадание №2 -------------");
        int arr [] = {first, second, last};

        int sum = 0;

        for(int numeric : arr)
        {
            if(numeric > 0)
                sum += numeric;
        }

        System.out.println(sum);
    }
    //3.Посчитать выражение макс(а*б*с, а+б+с)+3
    public void computeMax (int a, int b, int c)
    {
        //Вариант решение №1

        System.out.println("\nЗадание №3 -------------");
        int max = a*b*c;
        int max2 = a+b+c;

        if(max < b && b > c)
            max = b;
        else if (max < c)
            max = c;

        int result = 0;
        //  result = max*(a*b*c,a+b+c)+3; // Не понятна запятая в выражении, или я не понял задания.


        //Вариант решение №2

        if(max < max2)
            result = max2+3;
        else
            result = max +3;

        System.out.println(result);
    }

   // 4.Вычислить факториал числа n. n! = 1*2*…*n-1*n;
   public void factor(int n)
   {
       System.out.println("\nЗадание №4 -------------");

       int result = 1;

       for(int i = 1; i <= n; i++)
       {
           result *= i;
       }

       System.out.println(result);
   }

    //Это нашел интернете
    public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    //5. Посчитать сумму цифр заданного числа.
    public void sumNum(int num)
    {
        System.out.println("\nЗадание №5 -------------");
        char [] arr = Integer.toString(num).toCharArray();

        int result = 0;

        for(char number : arr)
        {
            result += Character.getNumericValue(number);
        }

        System.out.println(result);
    }
    //6. Посчитать сумму элементов массива с нечетными индексами

    public void sumElArr(int [] arr)
    {
        System.out.println("\nЗадание №6 -------------");
        int result = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(i%2 == 0)
                result += arr[i];
        }

        System.out.println(result);
    }
    //7. Вводим строку, которая содержит число, написанное прописью (0-999).
    //Получить само число. Например, дана строка: seven hundred fifty two = 752.
    public void crazyNumber (int num)
    {
        int one = num/100;
        int two = num/10%10;
        int three = num%10;

        StringBuilder builder = new StringBuilder();

        String[] first = {" ", "Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
        String [] second = {"Десять", "Одиннадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать", "Шестнадцать", "Семнадцать", "Восемнадцать", "Девятнадцать" };
        String [] second2 = {" ", " ", "Двадцать", "Тридцать", "Сорок", "Пятьдесят", "Шестьдясят", "Семьдясят", "Восемьдесят", "Девяносто"};
        String [] last = {"", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восем", "Девять"};

        if(one > 0)
        {
            builder.append(first[one]+" ");
            builder.append(second2[two]+" ");
            builder.append(last[three]+" ");
        }
        else if(one == 0 && two == 0)
        {
            builder.append(last[three]+" ");
        }
        else if(two > 0 && one == 0 && num/10 == 1)
        {
            builder.append(second[three]);
        }
        else if(two > 0 && one == 0 && num/10 > 1)
        {
            builder.append(second2[two]+" ");
            builder.append(last[three]+" ");
        }

        System.out.println(builder.toString());
    }

}
