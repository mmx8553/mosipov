package ru.job4j.PeakBankVisitors;
/**
 * Created by mosipov on 30.07.2017.
 */
public class MainClass {
    /**
     * заполнить, отсортировать и выдать.
     * @param args String[]
     */
    public static void main(String[] args) {
        Person[] persons = MyUtils.generateVisitorsSequence(10);
        MyUtils.visitorSequencePrint(persons);
        BankArrayList bal = MyUtils.fillBankArrayList(persons);
        MyUtils.sortetVisitorSequencePrint(bal);
        System.out.println("");
        System.out.println(bal.getHiVisitorTimePeriod());
    }
}
