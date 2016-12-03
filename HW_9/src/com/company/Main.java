package com.company;

public class Main {

    public static void main(String[] args) {
        Lib program = new Lib();
        Students s = new Students();
        Ron r = new Ron();
        /*1) Доделать консольный калькулятор, таким образом, чтобы была возможность применять базовые операции (+,-,/,*) для разных типов входных данных, таких как:
        - Integer a, Integer b
                - Double a, Double b
                - String a, String b
                * Реализовать такую функциональность можно при помощи оператора instanceof. Например, у нас есть два целых числа Integer a и Integer b, применив к ним оператор instanceof
        (а instanceof Integer) мы получим булевское выражение(true), и сможем подобрать необходимую перегрузку метода.
                **  Разбить функциональность на отдельные методы.*/
        program.calc();


        //7) Дан массив из 20 студентов. Определить к какому факультету в школе магии Хогвартс будет зачислен каждый из них. Учесть то, что к каждому факультету может быть зачисленно не более пяти новых студентов. Также факультеты могут быть определены только случайным образом.
        String [] students = {
                "Harry",
                "Ron",
                "Albus",
                "Bellatrix",
                "Hermione",
                "Ginevra",
                "Draco",
                "Lily",
                "Tom",
                "Lucius",
                "Narcissa",
                "Severus",
                "Antonin",
                "Alastor",
                "Arabella",
                "Augusta",
                "Alecto",
                "Alice",
                "Alicia",
                "Angelina"
        };

        program.goToSchool(students);
    }
}
