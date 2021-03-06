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
		int first = 1;
		int second = 2;
		assertThat(mC.findMax(first, second), is(2));
	}
	/**
     * Test of max 2 ints viceversa.
     */
	@Test
	public void testMaxOfTwoUpsidedown() {
		MaxClass mC = new MaxClass();
		int first = 2;
		int second = 1;
		assertThat(mC.findMax(first, second), is(2));
	}
	/**
     * Test of max 2 zero.
     */
	@Test
	public void testMaxOfTwoZero() {
		MaxClass mC = new MaxClass();
		int first = 0;
		int second = 0;
		assertThat(mC.findMax(first, second), is(0));
	}
	/**
     * Test of max of 3 int numbers.
     */
	@Test
	public void testMaxOfThree() {
		MaxClass mC = new MaxClass();
		int first = Integer.valueOf("11");
		int second = Integer.valueOf("7");
		int third = Integer.valueOf("15");
		assertThat(mC.findMaxOfThree(first, second, third), is(Integer.valueOf("15")));
	}
}