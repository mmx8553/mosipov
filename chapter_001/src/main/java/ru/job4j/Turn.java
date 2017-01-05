package ru.job4j;
/**
 * Класс - Переворот массива.
 * @author mosipov
 * @since 03.01.2017
 * @version 1
 *
 */
public class Turn {
	/**
	 * возвращает переворот.
	 * @author mosipov
	 * @since 03.01.2017
	 *
	 * @param  array int[]  **param**
	 * @return  array int[]
	 */
	public int[] back(int[] array) {
        /** локальные переменные */
		int tempArrayNumber;
        int index = 0;
        int arrLength = array.length;
        //index = 0..(array.length / 2 - 1)
        for (index = 0; index <= (arrLength / 2 - 1); index++) {
			tempArrayNumber = array[index];
			array[index] = array[arrLength - 1 - index];
			array[arrLength - 1 - index] = tempArrayNumber;
        }
        return array;
	}
}