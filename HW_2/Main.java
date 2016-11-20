package com.company;

public class Main {

    public static void main(String[] args) {

        //С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?
        byte daysInWeek = 7;
        short timeHasPassed = 234;
        int resultWeekPassed = timeHasPassed / daysInWeek;

        System.out.println("Полных недель прошло: " +resultWeekPassed);

        //Дан прямоугольник с размерами 543 * 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?
        short rectangle = 543;
        short sideSquare = 130;
        int resultCountSquare = rectangle / sideSquare;

        System.out.println("\nКоличиство квадратов: " +resultCountSquare);

        //Дано двузначное число. Найти:

        byte num = 56;

        //а) число десятков в нем;
        int countNumTens = num / 10;

        //б) число единиц в нем;
        int countUnits = num / 1;

        //в) сумму его цифр;
        int sum = num % 10 + countNumTens;

        //г) произведение его цифр.
        int sumMultiply = num % 10 * countNumTens;

        System.out.println("\nКоличиство десятков: " +countNumTens);
        System.out.println("Количиство едениц: " +countUnits);
        System.out.println("Сумма цифр: " +sum);
        System.out.println("Произведение цифр: " +sumMultiply);

        //Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.

        byte number = 64;
        int firstNum = number / 10;
        int lastNum = number % 10;
        int resultNumbers = lastNum * 10 + firstNum;

        System.out.println("\nДанное число: " +number);
        System.out.println("Произведение цифр: " +resultNumbers);

        /*
        Вычислить значение логического выражения при следующих значениях логических величин
        А, В и С: А = Истина,В = Ложь, С = Ложь:
         */

        boolean A = true;
        boolean B = false;
        boolean C = false;

        //а) не А и В;
        boolean optionA = (!A && B); // Работает и без () мне показалось со () будет правельней

        //b) А или не В;
        boolean optionB = (A || !B);

        //c) А и В или С
        boolean optionC = (A && B || C);

        System.out.println("\nа) не А и В: " +optionA);
        System.out.println("b) А или не В: " +optionB);
        System.out.println("c) А и В или С: " +optionC);

        /*
        Вычислить значение логического выражения
        при следующих значениях логических величин X, Y и Z:
        X = Ложь, Y = Ложь, Z = Истина:
         */

        boolean X = false;
        boolean Y = false;
        boolean Z = true;

        // a) X или Y и не Z;
        boolean nextOptionA = (X || Y && !Z);

        //b) не X и не Y;
        boolean nextOptionB = (!X && !Y);

        //c) не (X и Z) или Y;
        boolean nextOptionC = (X && Z) || Y;

        //d) X и не Y или Z;
        boolean nextOptionD = X && !Y || Z;

        //e) X и (не Y или Z);
        boolean nextOptionE = X && (!Y || Z);

        //f) X или (не (Y или Z))
        boolean nextOptionF = X || (!(Y || Z));

        System.out.println("\na) X или Y и не Z: " +nextOptionA);
        System.out.println("b) не X и не Y: " +nextOptionB);
        System.out.println("c) не (X и Z) или Y: " +nextOptionC);
        System.out.println("d) X и не Y или Z: " +nextOptionD);
        System.out.println("e) X и (не Y или Z): " +nextOptionE);
        System.out.println("f) X или (не (Y или Z)): " +nextOptionF);


        //Вычислить значение логического выражения:
        // Нагуглил Math.pow() но не использовал так ка кне проходили

        //a) x2 + y2  4при x =1, y =-1;
        int x = 1*1;
        int y = -1*1;
        boolean resultA = x+y <= 4;

        //b) (x  0) или (y24) при x = 1, y = 2;
        x = 1;
        y = 2*2;
        boolean resultB = (x >= 0) || (y != 4);

        //c) (x  0) и (y2 4) при x = 1, y = 2;
        boolean resultC = (x >= 0) && (y != 4);

        //d) (x * y 0) и (y > x) при x = 2, y = 1;
        x = 2;
        y = 1;
        boolean resultD = (x * y != 0) && (y > x);

        //e) (x * y 0) или (y < x) при x = 2, y = 1;
        boolean resultE = (x * y != 0) || (y < x);

        //f) (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        boolean resultF = (!(x * y < 0)) && (y > x);

        //g) (не(x * y < 0)) или (y > x) при x = 1, y = 2
        x = 1;
        y = 2;
        boolean resultG = (!(x * y < 0)) || (y > x);

        System.out.println("\na) x2 + y2 <= 4при x =1, y =-1: " +resultA);
        System.out.println("b) (x >= 0) или (y24) при x = 1, y = 2: " +resultB);
        System.out.println("c) (x >= 0) и (y24) при x = 1, y = 2: " +resultC);
        System.out.println("d) (x * y 0) и (y > x) при x = 2, y = 1: " +resultD);
        System.out.println("e) (x * y 0) или (y < x) при x = 2, y = 1: " +resultE);
        System.out.println("f) (не(x * y < 0)) и (y > x) при x = 2, y = 1: " +resultF);
        System.out.println("f) не(x * y < 0)) или (y > x) при x = 1, y = 2: " +resultG);
    }
}

