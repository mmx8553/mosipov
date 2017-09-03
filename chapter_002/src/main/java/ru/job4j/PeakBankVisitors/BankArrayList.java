package ru.job4j.PeakBankVisitors;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mosipov on 21.08.2017.
 */
public class BankArrayList {

    /**
	 * компаратор для сортировки коллекции.
    //todo ??? = реализуется только 1 метод из интерфейса КОМПАРАТОР = почему только 1, а не все в обязательном порядке ?
    private Comparator<ArrayItem> comparator = new Comparator<ArrayItem>() {
        public int compare(ArrayItem a1, ArrayItem a2) {
			return (a1.getTime() - a2.getTime());
        }
    };
	*/
    /**
     * инкапсулированный ArrayList для сортировки.
     */
    private List<ArrayItem> arrList = new ArrayList<ArrayItem>(10);
    /**
     * добавление в эррей лист элементов из массива описания вх/вых человеков.
     * @param pers Person
     */
    void add(Person pers) {
        arrList.add(new ArrayItem(1, pers.getTIn()));
        arrList.add(new ArrayItem(-1, pers.getTOut()));
    }
    /**
     * сортировка и выдача отсортированного эррей-листа.
     * @return getSortedArrayList ArrayList<ArrayItem>
     */
    public ArrayList<ArrayItem> getSortedArrayList() {
//        Collections.sort(this.arrList , this.comparator);
        Collections.sort(this.arrList, new Comparator<ArrayItem>() {
                    public int compare(ArrayItem a1, ArrayItem a2) {
                        return (a1.getTime() - a2.getTime());
                    }
        });
        return ((ArrayList<ArrayItem>) arrList);
    }
    /**
     * поиск и выдача в текстовом виде диапазона времени пиковой посещаемисти.
     * @return getHiVisitorTimePeriod String
     */
    public String getHiVisitorTimePeriod() {
        int sum = 0;
        int sumPred = 0;
        int sumPredPred = 0;
        int maxSum = 0;
        int hiStart = 0;
        int hiEnd = 0;
        ArrayItem tmpArrayItem = null;
        ArrayItem tmpArrayItemPred = null;
        Iterator<ArrayItem> itr = this.getSortedArrayList().iterator();
        while (itr.hasNext()) {
            if (tmpArrayItem != null) {
                tmpArrayItemPred = tmpArrayItem;
            }
            tmpArrayItem = itr.next();
            sumPredPred = sumPred;
            sumPred = sum;
            sum += (tmpArrayItem.getSign());
            if (sum < sumPred) {
                if (sumPred >  	sumPredPred) {
                    if (maxSum < sumPred) {
                        maxSum = sumPred;
                        hiStart = tmpArrayItemPred.getTime();
                        hiEnd = tmpArrayItem.getTime();

                    }
                }
            }
        }
        return String.format(" начало пика почетителей : %s , окочание : %s ", hiStart, hiEnd);
    }
}
