package ru.job4j;
/**
 * Класс - Поворот массива на 90 град по часовой  = !!! КВАДРАТНОГО .
 * @author mosipov
 * @since 06.01.2017
 * @version 1
 *
 */
public class Rotate {
	/**
	 * поворот массив.
	 * @author mosipov
	 * @since 06.01.2017
	 *
	 * @param  array int[]  **param**
	 * @return  array int[]
	 */
	public int[][] doRotate(int[][] array) {
        /** локальные переменные */
		int arraySize = array[0].length;
		int[][] tempArray = new int[arraySize][arraySize]; //= {{0, 0}, {0, 0}};  //необходимо инициализировать !?
        int iindex = 0;
        int jindex = 0;
		for (jindex = 0; jindex < arraySize; jindex++) {
			for (iindex = 0; iindex < arraySize; iindex++) {
				tempArray[iindex][jindex] = array[jindex][arraySize - 1 - iindex];
			}
		}
        return tempArray;
	}
}