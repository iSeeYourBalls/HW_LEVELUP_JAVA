package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Lib {

    //1 .Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
    public void addStar (String someWord)
    {
        System.out.println("Задание 1 .Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.\n");

        int len = someWord.length();

        for(int i = 0; i < len; i++)
        {
            someWord += "*";
            someWord = "*" + someWord;
        }

        System.out.println(someWord + "\n");
    }
    //2.Дано название футбольного клуба. Напечатать его на экране "столбиком".
    public void clubName (String name)
    {
        System.out.println("2.Дано название футбольного клуба. Напечатать его на экране \"столбиком\".\n");

        char [] arr = name.toCharArray();

        for(int i = 0; i < name.length(); i++)
        {
            System.out.println(arr[i]);
        }

    }
    //3.Найти сумму положительных нечетных чисел, меньших 50.
    public void findSum (int num)
    {
        System.out.println("\n3.Найти сумму положительных нечетных чисел, меньших 50.\n");

        int sum = 0;
        for(int i = 0;i <= num; i++)
        {
            if(i%2 == 1)
                sum += i;
        }
        System.out.println(sum + "\n");
    }
    //4.Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
    //а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
    //б) сумму вклада через: полгода, 2 года, 5 лет.
    public void findSumUp(int month, double sum, int upPercent)
    {
        System.out.println("4.Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:\n а) прирост суммы вклада за каждый месяц с 1-го марта до конца года; \n б) сумму вклада через: полгода, 2 года, 5 лет. \n");

        int monthInYear = 12;
        double sumHalfYear = sum;
        double sumTwoYear = sum;
        double sumFiveYear = sum;

        for(int i = month; i <= monthInYear; i++) //Я видел что вы противник такого решения, вы предпочли бы сделать с 0 и например i < (monthInYear - month)
        {
            sum += (sum / 100) * upPercent;
        }
        //Если нужно было через месяц то цикл такой
        //for(int i = month; i <= monthInYear; i+=2)
        //{
        //    sum += (sum / 100) * 2;
        //}

        //Пол года
        for(int i = 0;i <= monthInYear/2; i++)
        {
            sumHalfYear += (sumHalfYear / 100) * upPercent;
        }

        //2 года
        for(int i = 0;i <= monthInYear*2; i++)
        {
            sumTwoYear += (sumTwoYear / 100) * upPercent;
        }

        //5 года
        for(int i = 0;i <= monthInYear*5; i++)
        {
            sumFiveYear += (sumFiveYear / 100) * upPercent;
        }

        System.out.println("Сумма до конца года : " + sum);
        System.out.println("Сумма через пол года : " + sumHalfYear);
        System.out.println("Сумма через 2 года : " + sumTwoYear);
        System.out.println("Сумма через 5 лет : " + sumFiveYear);
    }

    //5.Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм.
    // Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.
    public void checkSizeEnv(int envWidth, int envHeight, int cardWidth, int cardHeight)
    {
        System.out.println("\n5.Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм. Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.\n");

        byte gap = 2;

        if((envWidth - gap) >= cardWidth && (envHeight - gap) >= cardHeight)
            System.out.println("Открытка войдет");
        else
            System.out.println("Размер открытки слишком велик!");
    }

    //6.Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.

    public void whoBig(double first, double second)
    {
        System.out.println("\n6.Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.\n");
        double max = first;
        if(max < second)
            max = second;
        System.out.println(max);
    }

    //7. Записать условие, которое является истинным, когда:
    //a) только одно из чисел А и В четное;
    //б) хотя бы одно из чисел А и В положительно;

    public  void isTrue(int a, int b)
    {
        System.out.println("\n7. Записать условие, которое является истинным, когда:\n a) только одно из чисел А и В четное; \n б) хотя бы одно из чисел А и В положительно;");

        if(a%2 == 0 || b%2 == 0)
            System.out.println("\nОдно из чисел четное");

        if(a > 0 || b > 0)
            System.out.println("Одно из чисел положительно");
    }

    //8.Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public void tableCon(int countLb)
    {
        System.out.println("\n8.Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).");

        double result = 0;
        for(int i = 1; i <= countLb; i++)
        {
            result = i*0.453;
            System.out.println(i + " фунт(ов) = "+result+" кг");
        }
    }
    //9. Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
    public void tableBacks(double course, int count)
    {
        System.out.println("\n9. Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).");

        double result = 0;
        for(int i = 1; i <= count; i++)
        {
            result = i*course;
            System.out.println(i + " Доллар(ов) = "+result+" грн");
        }
    }
    //Вариант 2
    public void tableBacks2()
    {
        System.out.println("\n9. Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму в долларах: ");
        String count = in.nextLine();

        System.out.print("Введите курс: ");
        String course = in.nextLine();

        double result = 0;
        for(int i = 1; i <= Integer.parseInt(count); i++)
        {
            result = i* Double.parseDouble(course);
            System.out.println(i + " Доллар(ов) = "+result+" грн");
        }
    }
    //10. Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.
    public void amoeba()
    {
        System.out.println("\n10. Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.");

        int amoebaCount = 1;

        for(int i = 0; i <= 24; amoebaCount *= 2, i +=3)
        {
                System.out.println("Прошло часов : "+i+" Количество амеб : "+amoebaCount);
        }
    }

    //11.В массиве записаны оценки по информатике 22 учеников класса.
    // Определить количество учеников, оценка которых меньше средней оценки по классу,
    // и вывести номера элементов массива, соответствующих таким ученикам.
    public void goToSchool()
    {
        System.out.println("\nВ массиве записаны оценки по информатике 22 учеников класса.\n Определить количество учеников, оценка которых меньше средней оценки по классу,\n и вывести номера элементов массива, соответствующих таким ученикам.");
        int sum = 0;
        int countStudents = 0;

        int [] students = new int [22];
        for(int i = 0; i < students.length; i++)
        {
            students[i] = 1 + (int)(Math.random() * ((12 - 1) + 1));
        }

        for(int i = 0; i < students.length; i++)
        {
            sum += students[i];
        }

       int mean = sum / students.length; // средняя оценка

        for(int i = 0; i <= students.length-1; i++)
        {
            if(students[i] <= mean)
            {
                countStudents++;
                System.out.println("Номер эелемента такого ученика : " + i);
            }
        }

        System.out.println("Кол-во таких студентов : " + countStudents);
    }

    //12.Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.
    public void checkArrNum()
    {
        System.out.println("\n12.Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.");

        int [] arr = {2,25,33,45,21,33,34};
        int countEven = 0;
        int countFive = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
                countEven++;
            if(arr[i]%10 == 5)
                countFive++;
        }

        System.out.println("Количество четных : "+ countEven);
        System.out.println("Количество пятерок : "+ countFive);
    }

}
