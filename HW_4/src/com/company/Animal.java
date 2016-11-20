package com.company;

public class Animal{
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;


    public Animal (boolean a, String b, int c)
    {
        this.vegetarian = a;
        this.eats = b;
        this.noOfLegs = c;
    }

    public Animal (boolean a)
    {
        this.vegetarian = a;
    }

    public Animal (boolean a, String b)
    {
        this.vegetarian = a;
        this.eats = b;
    }
   protected String isVegetarian() //Возможно нужно было по заданию создать boolean, тогда было бы без обозначения
    {
        return "Вегетарианец : " + vegetarian;
    }

    protected String getEats()
    {
        return "Что ест : " + eats;
    }

    protected String getNoOfLegs() //Возможно нужно было по заданию создать int или int, тогда было бы без обозначения
    {
        return "Кол-во ног : " + noOfLegs;
    }
}


