package com.company;

class Eagle extends Bird
{
    String specialProperty;
    public Eagle (boolean d)
    {
        super(false,"Мясо", 2);
        this.specialProperty = "Наличие рогов : " + d;

        System.out.println("\nEagle 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }

    private Eagle ()
    {
        super(false,"Мясо", 2);
    }
}