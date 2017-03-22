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
	 * удаление дубликатов в текстовом.
	 * @author mosipov
	 * @since 06.01.2017
	 *
	 * @param  arrayOfString String[]
	 * @return  array int[]
	 */
	public String[] doDoubleDel(String[] arrayOfString) {
        /** локальные переменные */
		int maxIndex = (arrayOfString.length - 1);
		int startIndex = 0;
		int arrayLengthToCopy = 1;
		String tempString = "";
//		String[] tempArray = new String[maxIndex]; //= {{0, 0}, {0, 0}};  //необходимо инициализировать !? -> поэтому arraySize
        int index = 0;
		//если элемент 1 то коируем 1 как результат
		arrayLengthToCopy = 1;
		//если элементов масиива более 1 то обработка перестановками элементов и далее обрезкой массива
		if (maxIndex > 0) {
			do {
			index = startIndex + 1;
				do {
					if (arrayOfString[startIndex] == arrayOfString[index]) {
						// меняем местами 2 элемента массива с индексами  index и maxIndex
						tempString = arrayOfString[maxIndex];
						arrayOfString[maxIndex] = arrayOfString[index];
						arrayOfString[index] = tempString;
						//далее хвост массива исключаем из обработки  - сравнений с пробежками
						maxIndex--;
						index--;
					}
				index++;
				} while (index < maxIndex);
			startIndex++;
			} while (startIndex < maxIndex);
			arrayLengthToCopy = maxIndex + 1;
		}
		String[] tempArray = Arrays.copyOf(arrayOfString, arrayLengthToCopy);
        return tempArray;
	}
}