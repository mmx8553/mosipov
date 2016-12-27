package ru.job4j;
/**
 * Класс Счетчик.
 * @author mosipov
 * @since 27.12.2016
 * @version 1
 *
 */
public class Counter {
	/**
	 * возвращает сумму четных чисел от start до finish.
	 * @author mosipov
	 * @since 27.12.2016
	 *
	 * @param start int **param**
	 * @param finish int **param**
	 * @return  int int
	 */
	public int add(int start, int finish) {
		/** сумма чисел */
		int summ = 0;
		int index = 0;
		for (index = start; index <= finish; index++) {
			if ((index % 2) == 0) {
				summ = summ + index;
			}
		}
		return summ;
	}
}