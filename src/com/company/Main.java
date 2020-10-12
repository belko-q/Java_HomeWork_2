package com.company;

import java.util.Date;
import java.text.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	    int yearOfBirthday = 1990;
	    int monthOfBirthday = 4;
        int dayOfBirthday = 1;


        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);


        boolean monthBiggerDay = true;
        if (monthOfBirthday<dayOfBirthday) {
            monthBiggerDay = false;
        }
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);


        String[] mass = new String[4];
        mass[0] = "С";
        mass[1] = "а";
        mass[2] = "н";
        mass[3] = "я";
        String res = "";
        for (int i=0; i<4; i++){
            res = res + mass[i];
        }
        System.out.println("Массив с моим именем: " + res);


        double myAge = 30;
        Date dateNow = new Date();
        double restOfMonth = (dateNow.getMonth()+1-4);
        double partYear = restOfMonth / 12.0;


        double myFullAge = myAge + partYear;
        System.out.println("Мне " + myFullAge + " лет");

    }
}
