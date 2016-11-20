package com.company;

class Account {
    int id;
    int amount;

    public  Account (int a, int b)
    {
        this.id = a;
        this.amount = b;
    }

    public Account()
    {
        id = 11;
        amount = 15;
    }

    public Account(int a)
    {
        this.id = a;
    }

    String getId()
    {
        return "id : " + id;
    }

    String getAmount()
    {
        return "amount : " + amount;
    }
}

class Animal{
    boolean vegetarian;
    String eats;
    int noOfLegs;

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
    String isVegetarian() //Возможно нужно было по заданию создать boolean, тогда было бы без обозначения
    {
        return "Вегетарианец : " + vegetarian;
    }

    String getEats()
    {
        return "Что ест : " + eats;
    }

    String getNoOfLegs() //Возможно нужно было по заданию создать int или int, тогда было бы без обозначения
    {
        return "Кол-во ног : " + noOfLegs;
    }
}

class Bird extends Animal
{
    public Bird (boolean a, String b, int c)
    {
        super(a, b, c);
    }

    public Bird (boolean a, String b)
    {
        super(a, b);
    }

    public Bird (boolean a)
    {
        super(a);
    }
}
class Eagle extends Bird
{
    String specialProperty;
    public Eagle (boolean a, String b, int c, boolean d)
    {
        super(a,b,c);
        this.specialProperty = "Наличие рогов : " + d;

        System.out.println("\nEagle 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }

    public Eagle (boolean a, String b, int c)
    {
        super(a,b,c);
        System.out.println("\nEagle 3 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
    }

    public Eagle (boolean a, String b)
    {
        super(a,b);
        System.out.println("\nEagle 2 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
    }

    public Eagle (boolean a)
    {
        super(a);
        System.out.println("\nEagle 1 параметр");
        System.out.println(isVegetarian());
    }
}


class Fish extends Animal
{
    public  Fish (boolean a, String b, int c)
    {
        super(a,b,c);
    }
    public  Fish (boolean a, String b)
    {
        super(a,b);
    }
    public  Fish (boolean a)
    {
        super(a);
    }
}

class Shark extends Fish
{
    String specialProperty;
    public Shark (boolean a, String b, int c, boolean d)
    {
        super(a,b,c);
        this.specialProperty = "Наличие зубов : " + d;

        System.out.println("\nShark 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }

    public Shark (boolean a, String b, int c)
    {
        super(a,b,c);

        System.out.println("\nShark 3 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
    }

    public Shark (boolean a, String b)
    {
        super(a,b);

        System.out.println("\nShark 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
    }

    public Shark (boolean a)
    {
        super(a);
        System.out.println("\nShark 1 парамет");
        System.out.println(isVegetarian());
    }

}
class Mammal extends Animal
{
    Mammal (boolean a, String b, int c)
    {
        super(a, b, c);
    }

    Mammal (boolean a, String b)
    {
        super(a,b);
    }

    Mammal (boolean a)
    {
        super(a);
    }

}

class Cow extends Mammal
{
    String specialProperty;
    Cow (boolean a, String b, int c, boolean d)
    {
        super(a,b,c);
        specialProperty = "Наличие копыт : " + d;

        System.out.println("\nCow 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }
    Cow (boolean a, String b, int c)
    {
        super(a,b,c);

        System.out.println("\nCow 3 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
    }
    Cow (boolean a, String b)
    {
        super(a,b);

        System.out.println("\nCow 2 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
    }
    Cow (boolean a)
    {
        super(a);

        System.out.println("\nCow 1 параметр");
        System.out.println(isVegetarian());
    }
}


public class Main {

    public static void main(String[] args) {

        int idUser = 25;
        int countUser = 12;
        System.out.println("\nЗадание №1 ---------------");
        // Выводим с 2 параметрами
        System.out.println("\nВыводим с 2 параметрами");
        Account twoParameters = new Account(idUser, countUser);
        System.out.println(twoParameters.getId());
        System.out.println(twoParameters.getAmount());

        // Выводим без параметров
        System.out.println("\nВыводим без параметров");
        Account nonParameters = new Account();
        System.out.println(nonParameters.getId());
        System.out.println(nonParameters.getAmount());

        // Выводим c 1 параметром
        System.out.println("\nВыводим c 1 параметром");
        Account oneParameters = new Account(idUser);
        System.out.println(oneParameters.getId());
        System.out.println(oneParameters.getAmount());

        //Задание №2
        System.out.println("\nЗадание №2 ----------------");
        boolean type;
        String whatEat;
        int howMuchLegs;

        //Shark
        type = false;
        whatEat = "Мясо";
        howMuchLegs = 0;
        boolean specialProperty = true;

        Shark sharkFour = new Shark(type, whatEat, howMuchLegs, specialProperty);
        Shark sharkThree = new Shark(type, whatEat, howMuchLegs);
        Shark sharkTwo = new Shark(type, whatEat);
        Shark sharkOne = new Shark(type);

        //Eagle
        type = false;
        whatEat = "Мясо";
        howMuchLegs = 2;
        specialProperty = false;

        Eagle eagleFour = new Eagle(type, whatEat, howMuchLegs, specialProperty);
        Eagle eagleThree = new Eagle(type, whatEat, howMuchLegs);
        Eagle eagleTwo = new Eagle(type, whatEat);
        Eagle eagleOne = new Eagle(type);

        //Cow
        type = true;
        whatEat = "Трава";
        howMuchLegs = 4;
        specialProperty = true;

        Cow cowFour = new Cow(type, whatEat, howMuchLegs, specialProperty);
        Cow cowThree = new Cow(type, whatEat, howMuchLegs);
        Cow cowTwo = new Cow(type, whatEat);
        Cow cowOne = new Cow(type);

    }



}