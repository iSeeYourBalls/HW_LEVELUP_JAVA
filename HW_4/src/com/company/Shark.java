package com.company;

class Shark extends Fish
{
    String specialProperty;
    public Shark (boolean d) {
        super(true, "Рыбу", 0);
        this.specialProperty = "Наличие зубов : " + d;

        System.out.println("\nShark 4 параметра");
        System.out.println(getEats());
        System.out.println(isVegetarian());
        System.out.println(getNoOfLegs());
        System.out.println(specialProperty);
    }

    private Shark()
    {
        super(true, "Рыбу", 0);
    }

}
