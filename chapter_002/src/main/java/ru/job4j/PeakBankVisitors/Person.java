package ru.job4j.PeakBankVisitors;

/**
 * Created by mmx on 30.07.2017.
 */
public class Person {
    /**
     * данные посетителя - время входа.
     */
    private int tIn;
	/**
	 *  данные посетителя - время выхода.
	 */
    private int tOut;
    /**
     * если конструктор без параметров, то вставлется случайное время посещения.
     */
    Person() {
        int timeOne = MyUtils.getRandomTime();
        int timeTwo = MyUtils.getRandomTime();
        if (timeOne < timeTwo) {
            this.settIn(timeOne);
            this.settOut(timeTwo);
        } else {
            this.settIn(timeTwo);
            this.settOut(timeOne);
        }
    }
    /**
     * конструктор с инициализацией данных.
     * @param tInArg int
     * @param tOutArg int
     */
    Person(int tInArg, int tOutArg) {
        this.tIn = tInArg;
        this.tOut = tOutArg;
    }
	/**
	* вывод времени входа.
	* @return getTIn int
	*/
	public int getTIn() {
        return tIn;
    }
	/**
	* вывод времени выхода.
	* @return getTOut int
	*/
    public int getTOut() {
        return tOut;
    }
	/**
	* ввод времени входа.
	* @param tIn int
	*/
    public void settIn(int tIn) {
        this.tIn = tIn;
    }
	/**
	* ввод времени выхода.
	* @param tOut int
	*/
    public void settOut(int tOut) {
        this.tOut = tOut;
    }


}
