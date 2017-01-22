package ru.job4j;
/**
 * Класс - стройка пирамид.
 * @author mosipov
 * @since 27.12.2016
 * @version 1
 *
 */
public class Paint {
	/**
	 * возвращает пирамиду.
	 * @author mosipov
	 * @since 27.12.2016
	 *
	 * @param h int **param**
	 * @return  string string
	 */
	public String piramid(int h) {
        /** локальные переменные */
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int indexSpace;
        String stLineLeftRight = stringOfSpaces(h - 1);
        String stLineCentre = " ";
        //index = 0
//        stLineLeftRight = stringOfSpaces(h - 1);
        sb.append(stLineLeftRight).append("^").append(stLineLeftRight).append("\n");  // + \n = ???
        //index = 1..(h-1)
        for (index = 1; index <= (h - 1); index++) {
            stLineLeftRight = stringOfSpaces(h - 1 - index);
            stLineCentre = stringOfSpaces(index * 2 - 1);
            sb.append(stLineLeftRight).append("^").append(stLineCentre).append("^").append(stLineLeftRight).append("\n");  // + \n = ???
        }
        return sb.toString();
	}
	/**
	 * возвращает строку пробелов (колво штук).
	 * @author mosipov
	 * @since 30.12.2016
	 *
	 * @param kolvo int **param**
	 * @return  string string
	 */
	public String stringOfSpaces(int kolvo) {
		/** локальные переменные */
		int index = 0;
		String stSpace = "";
		for (index = 0; index < kolvo; index++) {
			stSpace = stSpace + " ";
		}
		return stSpace;
	}
}