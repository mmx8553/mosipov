package ru.job4j;

import java.util.Arrays;
/**
 * Класс - удаление дубликатов из текстового массива.
 * @author mosipov
 * @since 10.02.2017
 * @version 1
 *
 */
 public class ArrayDoubleDel {
	/**
	 * удаление дубликатов в текстовом массиве.
	 * @author mosipov
	 * @since 06.01.2017
	 *
	 * @param  arrayOfString String[]
	 * @return  array String[]
	 */
	public String[] doDoubleDel(String[] arrayOfString) {
		int maxIndex = (arrayOfString.length - 1);
		String tempString = "";
		for (int startIndex = 0; startIndex < maxIndex; startIndex++) {
			for (int index = (startIndex + 1); index <= maxIndex; index++) {
					if (arrayOfString[startIndex] == arrayOfString[index]) {
						tempString = arrayOfString[maxIndex];
						arrayOfString[maxIndex] = arrayOfString[index];
						arrayOfString[index] = tempString;
						maxIndex--;
						index--;
				}
			}
		}
		return Arrays.copyOf(arrayOfString, (maxIndex + 1));
	}
}