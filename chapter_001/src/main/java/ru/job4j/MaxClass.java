package ru.job4j;
/**
 * Класс Максимум из 2 интов.
 * @author mosipov
 * @since 26.12.2016
 * @version 1
 *
 */
public class MaxClass {
	/**
	 * return max of 2 ints.
	 * @author mosipov
	 * @since 26.12.2016
	 *
	 * @param first int **param**
	 * @param second int **param**
	 * @return  int int
	 */
	public int findMax(int first, int second) {
		return first > second ? first : second;
	}
	/**
	 * return max of 3 ints.
	 * @author mosipov
	 * @since 26.12.2016
	 *
	 * @param first int **param**
	 * @param second int **param**
	 * @param third int **param**
	 * @return  int int
	 */
	public int findMaxOfThree(int first, int second, int third) {
		return this.findMax(first, this.findMax(second, third));
	}
}