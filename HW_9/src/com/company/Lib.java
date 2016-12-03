package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lib {
    public void calc()
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter operator : ");
            String operator = scanner.next();

            System.out.print("Enter first operand : ");
            double a = scanner.nextDouble();

            System.out.print("Enter second operand : ");
            double b = scanner.nextDouble();

            switch (operator) {
                case "+" :
                    System.out.println(a + " " + operator + " " + b + " = " + Calc.sum(a,b));
                    break;
                case "*" :
                    System.out.println(a + " " + operator + " " + b + " = " + Calc.multiply(a, b));
                    break;
                case "/" :
                    System.out.println(a + " " + operator + " " + b + " = " + Calc.divided(a, b));
                    break;
                case "-" :
                    System.out.println(a + " " + operator + " " + b + " = " + Calc.minus(a, b));
                    break;
            }
            System.out.println("What you like to continue? Enter y/n ");

            String exitWork = scanner.next();

            if(exitWork != null && exitWork.length() > 0 && !exitWork.equalsIgnoreCase("y")) break;;
        }
    }
    /*
    7) Дан массив из 20 студентов.
    Определить к какому факультету в школе магии
    Хогвартс будет зачислен каждый из них.
    Учесть то, что к каждому факультету может
    быть зачисленно не более пяти новых студентов.
    Также факультеты могут быть определены только случайным образом.
     */
    public void goToSchool(String [] arr)
    {
        int gryffindor = 0;
        int slytherin = 0;
        int hufflepuff = 0;
        int ravenclaw = 0;
        Faculty faculty;

        for(String name : arr)
        {
            faculty = Faculty.getRandomFaculty();

            if(gryffindor < 5) {
                System.out.println(name + " зачислен в " + faculty.nameRu);
                gryffindor++;
            }
            else if(hufflepuff < 5) {
                System.out.println(name + " зачислен в " + faculty.nameRu);
                hufflepuff++;
            }
            else if(slytherin < 5) {
                System.out.println(name + " зачислен в " + faculty.nameRu);
                slytherin++;
            }
            else if(ravenclaw < 5) {
                System.out.println(name + " зачислен в " + faculty.nameRu);
                ravenclaw++;
            }

        }
    }
}
