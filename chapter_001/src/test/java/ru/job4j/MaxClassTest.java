package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 26.12.2016
 * @version 1
 *
 */
public class MaxClassTest {
	/**
     * Test of max 2 ints.
     */
	@Test
	public void testMaxOfTwo() {
		MaxClass mC = new MaxClass();
		int first = Integer.valueOf("10");
		int second = Integer.valueOf("20");
		assertThat(mC.findMax(first, second), is(Integer.valueOf("20")));
	}
	/**
     * Test of max 2 zero.
     */
	@Test
	public void testMaxOfTwoZero() {
		MaxClass mC = new MaxClass();
		int first = 0;
		int second = 0;
		assertThat(mC.findMax(first, second), is(Integer.valueOf("0")));
	}
}
