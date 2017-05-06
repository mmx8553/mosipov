package ru.job4j;
/**
 * Класс - удаление дубликатов из текстового массива.
 * @author mosipov
 * @since 10.02.2017
 * @version 1
 *
 */
public class CheckSubString {
    /**
     * проверяющую, что строка sub является подстрокой origin.
     * @author mosipov
     * @since 06.01.2017
	 *
	 * @param  origin String **param**
	 * @param  sub String **param**
     * @return  contains boolean
     */
    public boolean contains(String origin, String sub) {
        char[] arOrigin = origin.toCharArray();
        char[] arSub = sub.toCharArray();
        boolean isArrayContains = true;
        boolean returnIsArrayContains = false;
        for (int i = 0; i <= (arOrigin.length - arSub.length); i++) {
            if (arOrigin[i] == arSub[0]) {
				isArrayContains = true;
                for (int j = 0; j < (arSub.length - 1); j++) {
                    isArrayContains &= (arSub[j] == arOrigin[i + j]);
                }
				returnIsArrayContains |= isArrayContains;
            }
		}
        return returnIsArrayContains;
    }
}