package ru.job4j;

//import java.util.Arrays;
//import java.lang.*
/**
 * Класс - удаление дубликатов из текстового массива.
 * @author mosipov
 * @since 10.02.2017
 * @version 1
 *
 */
public class CheckSubString {
	/*
    /**
     * проверяющую, что строка sub является подстрокой origin.
     * @author mosipov
     * @since 06.01.2017
     *
	 * @param  inputString String **param**
     * @return  contains boolean
     *111/
    public char[] stringToArrayOfChar(String inputString) {
        char[] arOfChar = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            arOfChar[i] = inputString.charAt(i);
        }
        return arOfChar;
    }
	*/
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
        char[] arOrigin = origin.toCharArray();  //stringToArrayOfChar(origin);
        char[] arSub = sub.toCharArray();  //stringToArrayOfChar(sub);
        boolean isArrayContains = true;
        boolean returnIsArrayContains = false;
        for (int i = 0; i < (arOrigin.length - arSub.length); i++) {
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