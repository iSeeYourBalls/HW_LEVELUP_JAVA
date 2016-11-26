package com.company;
import java.util.Arrays;

public class Lib {

    /*
    1. Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
    1) год не является високосным;
    2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).
     */
    public void countDaysInMouth (int mouth)
    {
        System.out.println("Задание №1 -------------");
        if(getCurrentYear()%4 == 0)
            Mouth.February.setCountDays(29);

        switch(mouth)
        {
            case 1: System.out.println(Mouth.January.getCountDays());
                break;
            case 2: System.out.println(Mouth.February.getCountDays());
                break;
            case 3: System.out.println(Mouth.March.getCountDays());
                break;
            case 4: System.out.println(Mouth.April.getCountDays());
                break;
            case 5: System.out.println(Mouth.May.getCountDays());
                break;
            case 6: System.out.println(Mouth.June.getCountDays());
                break;
            case 7: System.out.println(Mouth.July.getCountDays());
                break;
            case 8: System.out.println(Mouth.August.getCountDays());
                break;
            case 9: System.out.println(Mouth.September.getCountDays());
                break;
            case 10: System.out.println(Mouth.October.getCountDays());
                break;
            case 11: System.out.println(Mouth.November.getCountDays());
                break;
            case 12: System.out.println(Mouth.December.getCountDays());
                break;
            default:
                System.out.println("Месяц не найден.");
        }
    }
    public void countDaysInMouth2 (int mouth)
    {
        System.out.println("Задание №1 -------------Вариант 2");
        switch (mouth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
            case 2:
                if(getCurrentYear()%4 == 0)
                    System.out.println("29");
                else
                    System.out.println("28");
        }
    }
    public static int getCurrentYear()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
    /*
    2. Мастям игральных карт условно присвоены следующие порядковые номера:
    масти "пики" — 1, масти "трефы" — 2, масти "бубны" — 3, масти "червы" — 4,
    а достоинству карт: "валету" — 11, "даме" — 12, "королю" — 13, "тузу" — 14
    (порядковые номера карт остальных достоинств соответствуют их названиям:
    "шестерка", "девятка" и т. п.). По заданным номеру масти m (1 <= m <=  4)
    и номеру достоинства карты k (6 <= k <= 14) определить полное название (масть и достоинство)
    соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.
     */
    public void getCard(int m, int k)
    {
        System.out.println("\nЗадание №2 -------------");
        String subNameCard = "";
        String cardName = "";

        switch(m)
        {
            case 1:
                subNameCard = "пики";
                break;
            case 2:
                subNameCard = "трефы";
                break;
            case 3:
                subNameCard = "бубны";
                break;
            case 4:
                subNameCard = "червы";
                break;
            default:
                System.out.println("Указана не существующая масть!");
        }

        switch(k)
        {
            case 6:
                cardName = "Шестерка";
                break;
            case 7:
                cardName = "Семерка";
                break;
            case 8:
                cardName = "Восьмерка";
                break;
            case 9:
                cardName = "Девятка";
                break;
            case 10:
                cardName = "Десятка";
                break;
            case 11:
                cardName = "Валет";
                break;
            case 12:
                cardName = "Дама";
                break;
            case 13:
                cardName = "Король";
                break;
            case 14:
                cardName = "Туз";
                break;
            default:
                System.out.println("Указана не существующая карта!");
        }

        System.out.println(cardName + " " + subNameCard);
    }
    /*
    3. Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
    а) понедельник;
    б) i-й день недели (если 1 января — понедельник, то d=1 , если вторник — d=2, ..., если воскресенье —  d= 7).
     */
    public void getDayName(int numDay)
    {
        System.out.println("\nЗадание №3 -------------");
        String day = "";
        int d = 0;

        int num = numDay%7 == 0? 7:numDay%7;

        switch (num) {
            case 1: day = "Понедельник"; d = 1; break;
            case 2: day = "Вторник"; d = 2; break;
            case 3: day = "Среда"; d = 3; break;
            case 4: day = "Четверг"; d = 4; break;
            case 5: day = "Пятница"; d = 5; break;
            case 6: day = "Суббота"; d = 6; break;
            case 7: day = "Воскресенье"; d = 7; break;
        }
        System.out.println(day);
    }

    /*
    4. Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом будет строка “one”.
     */
    public void translateInt()
    {
        System.out.println("\nЗадание №4 -------------");
        for(int i = 1; i <= 10; i++)
        {
            switch (i)
            {
                case 1:
                    System.out.println(i+" - one");
                    break;
                case 2:
                    System.out.println(i+" - two");
                    break;
                case 3:
                    System.out.println(i+" - three");
                    break;
                case 4:
                    System.out.println(i+" - four");
                    break;
                case 5:
                    System.out.println(i+" - five");
                    break;
                case 6:
                    System.out.println(i+" - six");
                    break;
                case 7:
                    System.out.println(i+" - seven");
                    break;
                case 8:
                    System.out.println(i+" - eight");
                    break;
                case 9:
                    System.out.println(i+" - nine");
                    break;
                case 10:
                    System.out.println(i+" - ten");
                    break;
            }
        }
    }
    /*
        5. Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.
     */
    public void crazyString(String someString)
    {
        System.out.println("\nЗадание №5 -------------");
        char [] arr = someString.toCharArray();
        for(int i = arr.length-1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
    }
    /*
    6. Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать условию (пример - emailaddr@domain.zone)
    1)	emailaddr > 4 символов
    2)	1 < domain < 10
    3)	2 <= zone < 5
     При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.
     */
    String checkEmail (String email)
    {
        System.out.println("\nЗадание №6 -------------");
        if(email.indexOf('@') > 0)
        {
            String name = email.substring(0,email.indexOf('@'));
            String domain = email.substring(email.indexOf('@'), email.indexOf('.'));
            String zone = email.substring(email.indexOf('.'));
            if(name.length() > 4)
            {
                if((domain.length()-1) > 1 && (domain.length()-1) < 10)
                {
                    if((zone.length()-1) >= 2 && (zone.length()-1) < 5)
                        return "success";
                    else
                        return  "Длина зоны домена должна быть не меньше 2 и не больше 4 символов!";
                }
                else
                    return "Домен почтового адреса не должен быть меньше 1 и больше 10 символов";
            }
            else
                return "Длина имени перед символом @, должна быть было 4 символов";
        }
        else
            return "Введенная строка не является электронным адресом";

    }
    /*
    7. Дан массив строк. Написать программу, которая:
    а) выводит на экран значение всех строк через запятую, длина которых больше n.
    б) выводит на экран значение всех неповторяющихся строк через запятую.
     */
    public void forString (String [] arr)
    {
        System.out.println("\nЗадание №7 Пункт А");
        int n = 4;
        for(String s : arr)
        {
            if(s.length() > n)
                System.out.println(s);
        }
        System.out.println("\nЗадание №7 Пункт Б");
        Arrays.sort(arr);

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < arr.length-1; i++)
        {
            if(!arr[i].equals(arr[i+1]))
            {
                if(i > 0)
                    builder.append(", ");
                builder.append(arr[i]);
            }
        }
        System.out.print(builder.toString());
    }
}
