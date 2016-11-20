package com.company;

class Cow extends Mammal
{
    String specialProperty;
    Cow (boolean d)
    {
        super(false, "траву", 4);
        specialProperty = "Наличие копыт : " + d;

        System.out.println("\nCow 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }

    private Cow()
    {
        super(false, "Сено", 4);
        System.out.println("\nCow 0 параметров");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
    }
}
