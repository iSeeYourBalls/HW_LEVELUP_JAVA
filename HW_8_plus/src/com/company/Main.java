package com.company;

public class Main {

    public static void main(String[] args) {
	Lib program = new Lib();
        //1.Определить какой четверти принадлежит точка с координатами (х,у)
        program.getCoord(123,-123);
        //2.Найти суммы только положительных из трех чисел
        program.searchPosNum(483, -55, 100);
        //3.Посчитать выражение макс(а*б*с, а+б+с)+3
        program.computeMax(1,2,3);
        // 4.Вычислить факториал числа n. n! = 1*2*…*n-1*n;
        program.factor(5);
        System.out.println(program.factorial(5));
        //5. Посчитать сумму цифр заданного числа.
        program.sumNum(999);
        //6. Посчитать сумму элементов массива с нечетными индексами
        int arr [] = {1,2,3,4,5,6};
        program.sumElArr(arr);
        //7. Вводим строку, которая содержит число, написанное прописью (0-999).
        //Получить само число. Например, дана строка: seven hundred fifty two = 752.
        program.crazyNumber(455);
        program.crazyNumber(45);
        program.crazyNumber(4);

    }
}
