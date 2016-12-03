package com.company;

public class Students {
    /*
    4) Описать объект студента который должен обладать свойствами:
    имя(строка), фамилия(строка), возраст(число), язык(перечисление), факультет(перечисление).
    (В ДЗ это задание было вторым 3, я так понял опечатка, последующие задание будут идти с +1 номером)
    */

    String name = "Ron";
    String surname = "Weasley";
    int age = 25;
    Lang lang = Lang.EN;
    Faculty faculty = Faculty.GRYFFINDOR;

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", lang=" + lang +
                ", faculty=" + faculty +
                '}';
    }
}
class Ron extends Students{
    /*
    5) Переопределить в классе студента метод toString() таким образом,
    чтобы в результате его вызова для объекта студента с выбранным языком EN возвращалась строка вида:
    "Ron Weasley is 24 years old and studying at Griffindor faculty".
    Либо, если язык был выбран RU возвращалась строка вида: "Ron Weasley 24 лет, студент факультета Гриффиндор".
     */

    @Override
    public String toString() {
        String result;

        if(Lang.EN == lang)
            result = name+" "+surname+" is "+age+" years old and studying at "+faculty.nameEn+" faculty";
        else
            result = name+" "+surname+" "+age+" лет, студент факультета "+faculty.nameRu;

        return result;
    }
}
