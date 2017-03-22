package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 07.01.2017
 * @version 1
 *
 */
public class ArrayDoubleDelTest {
	/**
     * Test of 3 cell array.
     */
	@Test
	public void testArrayRotate() {
		String[] arrayOfStringToCompare = new String[] {"one", "two", "four"};
		String[] arrayOfStringToCompareInput = new String[] {"one", "two", "one", "four", "two"};
		ArrayDoubleDel doubleDelClassInstance = new ArrayDoubleDel();
		assertThat(arrayOfStringToCompare, is(doubleDelClassInstance.doDoubleDel(arrayOfStringToCompareInput)));
	}
}