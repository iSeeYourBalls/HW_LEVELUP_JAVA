package com.company;
import java.util.Random;
public enum Faculty {
    /*
    2.Объявить класс перечислений Faculty
    у которого будут свойства nameEn(строка), nameRu(строка),
    и элементы перечисления: GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW.
     */
    GRYFFINDOR("Грифиндор", "Gryffindor"),
    SLYTHERIN("Слизерин", "Slytherin"),
    HUFFLEPUFF("Пуффендуй", "Hufflepuff"),
    RAVENCLAW("Когтевран", "Ravenclaw");

    String nameRu;
    String nameEn;

    Faculty(String nameRu, String nameEn) {
        this.nameRu = nameRu;
        this.nameEn = nameEn;
    }

    /*
    6) Написать программу, которая случайным образом возвращает факультет в виде перечисления:
    GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW. * Использовать для выполнения метод nextInt(),
    который можно вызвать у экземпляра класса Random.
     */
    public static Faculty getRandomFaculty()  {
        Faculty[] arr = Faculty.values();
        Random random = new Random();
        return arr[random.nextInt(arr.length)];
    }

}
