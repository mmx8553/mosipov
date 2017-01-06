package ru.job4j;
/**
 * Класс - Сортировка массива.
 * @author mosipov
 * @since 06.01.2017
 * @version 1
 *
 */
public class Sort {
	/**
	 * сортирует массив.
	 * @author mosipov
	 * @since 06.01.2017
	 *
	 * @param  array int[]  **param**
	 * @return  array int[]
	 */
	public int[] sort(int[] array) {
        /** локальные переменные */
		int tempArrayNumber;
        int index = 0;
        boolean sortNotEnd = false;
        int arrSortLimit = array.length - 1;
		do {
			arrSortLimit--;
			sortNotEnd = false;
			for (index = 0; index <= arrSortLimit; index++) {
				if (array[index] > array[index + 1]) {
					sortNotEnd = true;
					tempArrayNumber = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tempArrayNumber;
				}
			}
		} while (sortNotEnd);
        return array;
	}
}