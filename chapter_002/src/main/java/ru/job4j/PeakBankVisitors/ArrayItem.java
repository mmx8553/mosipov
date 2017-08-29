package ru.job4j.PeakBankVisitors;
/**
 * Created by  mosiopov on 14.08.2017.
 */
public class ArrayItem {
    /**
     * инкапсулированные знак увеличение/уменшение посещаемости .
     */
    private int sign;
	/**
	*инкапсулированные время увеличения/уменшения посещаемости.
	*/
    private int time;
    /**
     * элемент массива для подсчета пика посещаемости.
     * @param inSign int
     * @param inTime int
     */
    ArrayItem(int inSign, int inTime) {
        this.sign = inSign;
        this.time = inTime;
    }
    /**
     * возвращает приватное поле.
     * @return getSign int
     */
    public int getSign() {
        return this.sign;
    }
    /**
     * возвращает приватное поле.
     * @return getTime int
     */
    public int getTime() {
        return this.time;
    }
}
