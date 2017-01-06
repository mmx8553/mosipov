package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 04.01.2017
 * @version 1
 *
 */
public class SortTest {
	/**
     * Test of 3 cell array.
     */
	@Test
	public void testArrayThree() {
		int[] arrRemake = {3, 17, 9};
		int[] arrCompare = {3, 9, 17};
		Sort srt = new Sort();
		assertThat(arrCompare, is(srt.sort(arrRemake)));
	}
	/**
     * Test of 7 cell array.
     */
	@Test
	public void testArraySeven() {
		int[] arrRemake = {1, 8, 3, 4, 10, 6, 7};
		int[] arrCompare = {1, 3, 4, 6, 7, 8, 10};
		Sort srt = new Sort();
		assertThat(arrCompare, is(srt.sort(arrRemake)));
	}
}