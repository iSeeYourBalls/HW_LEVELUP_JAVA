package com.company;

public enum Mouth {
    January(31,1, "January", "Январь"),
    February(28,2, "February", "Февраль"),
    March(31,3, "March", "Март"),
    April(30,4, "April", "Апрель"),
    May(31,5, "May", "Май"),
    June(30,6, "June", "Июнь"),
    July(31,7, "July", "Июль"),
    August(31,8, "August", "Август"),
    September(30,9, "September", "Сентябрь"),
    October(31,10, "October", "Октябрь"),
    November(30,11, "November", "Ноябрь"),
    December(31,12, "December", "Декабрь");

    int countDays;
    int number;
    String engName;
    String ruName;

    Mouth(int countDays, int number, String engName, String ruName) {
        this.countDays = countDays;
        this.number = number;
        this.engName = engName;
        this.ruName = ruName;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    public int getNumber() {
        return number;
    }

    public String getEngName() {
        return engName;
    }

    public String getRuName() {
        return ruName;
    }
}
