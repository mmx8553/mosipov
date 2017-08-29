package ru.job4j.PeakBankVisitors;

import java.util.Random;
import java.util.Iterator;
/**
 * Created by mosipov  on 30.07.2017.
 */
public class MyUtils {
    /**
     * Bank works from 8 to 20 - so start & end time - is the same.
     * @return time in int format = (HH*100+MM)
     */
    static int getRandomTime() {
        Random rand = new Random();
        /** часы случано*/
        int hours = rand.nextInt(12);
        /**  минуты случайно*/
        int minutes = rand.nextInt(60);
        /**  вернуть случайное время as int с 8-00 до 20-00. */
        return ((8 + hours) * 100 + minutes);
    }
    /**
     * установить у человека person случайное время входа в банк / выхода из банка.
     * @param person  - человек , у которго устанавливается случайное время
     */
    static void setRandomInOutTimeToPrson(Person person) {
        int timeOne = getRandomTime();
        int timeTwo = getRandomTime();
        if (timeOne < timeTwo) {
            person.settIn(timeOne);
            person.settOut(timeTwo);
        } else {
            person.settIn(timeTwo);
            person.settOut(timeOne);
        }

    }
    /**
     * воссоздать посещаемость в банке.
     * @param n - сколько было посетителей
     * @return массиа человеков со временами взода и выхода
     */
    static Person[] generateVisitorsSequence(int n) {
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person();
        }
        return persons;
    }
    /**
     * вывод времени входа и выхода людей из банка.
     * @param persons Person[]
     */
    static void visitorSequencePrint(Person[] persons) {
        for (Person pers:persons) {
            if (pers != null) {
                System.out.print(pers.getTIn() + " ");
                System.out.println(pers.getTOut() + " ");
            }
        }
    }
    /**
     * @param persons Person[] ** массив данных о человеках
     * @return bal BankArrayList  ** возвращает заполненный из массива BankArrayList
     */
    static BankArrayList fillBankArrayList(Person[] persons) {
        BankArrayList bal = new BankArrayList();
        for (Person pers:persons) {
            if (pers != null) {
                bal.add(pers);
            }
        }
        return bal;
    }
    /**
     * выдача строкой всемен всех посетителей в хронологич. последовательности
     * @param bal BankArrayList
     */
    static void sortetVisitorSequencePrint(BankArrayList bal) {
        ArrayItem tmpArrayItem;
        Iterator<ArrayItem> itr = bal.getSortedArrayList().iterator();
        while (itr.hasNext()) {
            tmpArrayItem = itr.next();
            System.out.print(String.format(" %s %s  ", ((tmpArrayItem.getSign() == 1) ? "вход =" : "выход ="), tmpArrayItem.getTime()));
        }
    }
}
