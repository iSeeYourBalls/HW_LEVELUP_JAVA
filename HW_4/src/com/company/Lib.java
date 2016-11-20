package com.company;

public class Lib {
    public void dayOfWeek(String [] dayOfWeek, int num)
    {
        System.out.println("День недели: " + dayOfWeek[num]);
    }

    public void isEven(int num, String name)
    {
        boolean sIsEven = (num % 2) == 0 ? true : false;
        System.out.println("Число массива в переменной "+ name +"  четное? - " + sIsEven);
    }

    public void whoLarger(int a, int b)
    {
        String result = a > b ? "s" : "k";
        System.out.println("Больше элемент массива с именем " + result);
    }

    public void arrCheck (int[][] arrMatrix, int x, int y, String string)
    {
        System.out.println(string + arrMatrix[x][y]);
    }

}
