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
	public void testArrayDoubleFirstVariant() {
		String[] arrayOfStringToCompare = new String[] {"one", "two", "four"};
		String[] arrayOfStringToCompareInput = new String[] {"one", "two", "one", "four"};
		assertThat(arrayOfStringToCompare, is(new ArrayDoubleDel().doDoubleDel(arrayOfStringToCompareInput)));
	}
	/**
     * Test of 8 cell array.
     */
	@Test
	public void testArrayDoubleSecondVariant() {
		String[] arrayOfStringToCompare = new String[] {"a", "b", "c"};
		String[] arrayOfStringToCompareInput = new String[] {"a", "b", "c", "c"};
		assertThat(arrayOfStringToCompare, is(new ArrayDoubleDel().doDoubleDel(arrayOfStringToCompareInput)));
	}
}