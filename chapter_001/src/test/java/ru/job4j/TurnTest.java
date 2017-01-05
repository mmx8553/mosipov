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
public class TurnTest {
	/**
     * Test of 3 cell array.
     */
	@Test
	public void testArrayThree() {
		int[] arrRemake = {3, 7, 9};
		int[] arrCompare = {9, 7, 3};
		Turn tur = new Turn();
		assertThat(arrCompare, is(tur.back(arrRemake)));
	}
	/**
     * Test of 7 cell array.
     */
	@Test
	public void testArraySeven() {
		int[] arrRemake = {1, 8, 3, 4, 10, 6, 7};
		int[] arrCompare = {7, 6, 10, 4, 3, 8, 1};
		Turn tur = new Turn();
		assertThat(arrCompare, is(tur.back(arrRemake)));
	}
}