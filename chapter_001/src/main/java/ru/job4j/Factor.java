package ru.job4j;
/**
 * Класс Счетчик.
 * @author mosipov
 * @since 27.12.2016
 * @version 1
 *
 */
public class Factor {
	/**
	 * возвращает сумму четных чисел от start до finish.
	 * @author mosipov
	 * @since 27.12.2016
	 *
	 * @param nom int **param**
	 * @return  int int
	 */
	public int calc(int nom) {
		/** сумма чисел */
		int factorial = 1;
		int index = 0;
		for (index = 1; index <= nom; index++) {
			factorial = factorial * index;
		}
		return factorial;
	}
}